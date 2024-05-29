package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Bus;
import co2103.hw1.domain.Depot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class BusController {
    @GetMapping("/buses")
    public String listBuses(@RequestParam("depot") int depotId, Model model) {
        Depot depot = Hw1Application.depots.stream()
                .filter(d -> d.getId() == depotId)
                .findFirst()
                .orElse(null);

        if (depot != null) {
            model.addAttribute("buses", depot.getBuses());
        } else {
            model.addAttribute("errorMessage", "Depot not found");
        }

        return "buses/list";
    }

    @GetMapping("/buses/new")
    public String newBusForm(@RequestParam("depot") int depotId, Model model) {
        model.addAttribute("depotId", depotId);
        model.addAttribute("bus", new Bus());
        return "buses/form";
    }



    @PostMapping("/addBus")
    public String addBus(@RequestParam("depot") int depotId, @Valid Bus bus, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            model.addAttribute("depotId", depotId);
            return "buses/form";
        }

        Depot depot = Hw1Application.depots.stream()
                .filter(d -> d.getId() == depotId)
                .findFirst()
                .orElse(null);

        if (depot == null) {
            model.addAttribute("errorMessage", "Depot not found");
            return "error"; //
        }

        depot.getBuses().add(bus);

        redirectAttributes.addFlashAttribute("successMessage", "Bus added successfully");

        return "redirect:/buses?depot=" + depotId;
    }


}
