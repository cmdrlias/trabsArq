package com.trabalho.controller;

import com.trabalho.model.Equipe;
import com.trabalho.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @RequestMapping("/equipes")
    public String index(HttpSession session, Model model) {
        List<Equipe> equipes = equipeService.findAll();

        model.addAttribute("equipes", equipes);

        configure(model);
        return "equipes";
    }

    private void configure(Model model) {
        model.addAttribute("userSection", Boolean.TRUE);
        model.addAttribute("pageTitle", "Equipes");
    }
}
