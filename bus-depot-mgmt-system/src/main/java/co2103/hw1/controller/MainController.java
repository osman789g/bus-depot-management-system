package co2103.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showStartPage() {
        return "start";
    }

    @PostMapping("/")
    public String handleStartPagePost() {
        return "start";
    }

}
