package com.example.profile_app.controller;

import com.example.profile_app.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfileController {
    @GetMapping("/")
    public String redirectToForm() {
    return "redirect:/create";
    }

    @GetMapping("/create")
    public String showForm(Model model) {
        model.addAttribute("profile", new Profile());
        return "profileForm";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Profile profile, Model model) {
        model.addAttribute("profile", profile);
        return "profileSuccess";
    }
}
