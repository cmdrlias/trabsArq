package com.trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class JogadorController {
    @RequestMapping("/jogadores")
    public String index(HttpSession session, Model model) {
        return "jogadores";
    }
}
