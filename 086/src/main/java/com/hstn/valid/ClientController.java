package com.hstn.valid;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @GetMapping("/client")
    public String showClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "client-form";
    }

    @PostMapping("/proceessForm")
    public String proceessForm(@Valid @ModelAttribute("client") Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "client-form";
        } else {
            return "client-confirmation";
        }
    }

}
