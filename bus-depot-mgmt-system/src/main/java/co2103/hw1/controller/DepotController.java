package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Depot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Objects;

@Controller
@RequestMapping("/depots")
public class DepotController {

    @GetMapping("/depots/form.jsp")
    public String showAddDepotForm(Model model) {
        model.addAttribute("depot", new Depot());
        return "depots/form.jsp";
    }

    @GetMapping
    public String listDepots(Model model) {
        model.addAttribute("depots", Hw1Application.depots);
        return "depots/list";
    }

    @GetMapping("/newDepot")
    public String newDepotForm(Model model) {
        model.addAttribute("depot", new Depot());
        return "depots/form";
    }
    @GetMapping("/add")
    public String showDepotForm(Model model) {
        model.addAttribute("depot", new Depot());
        return "depots/form";
    }

    @PostMapping("/addDepot")
    public String addDepot(@Valid @ModelAttribute("depot") Depot depot, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "depots/form";
        }

        boolean idExists = Hw1Application.depots.stream()
                .anyMatch(d -> Objects.equals(d.getId(), depot.getId()));

        if (idExists) {
            result.rejectValue("id", "error.depot", "A depot with this ID already exists.");
            return "depots/form";
        }
        Hw1Application.depots.add(depot);
        return "redirect:/depots";
    }

}
