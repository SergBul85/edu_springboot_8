package com.hstn.valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/client")
    public String showClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "client-form";
    }
}
