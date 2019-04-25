package com.trabalho.controller;

import com.trabalho.dao.JogadorDao;
import com.trabalho.model.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorDao jogadorDao;

    @RequestMapping(value = { "/list" })
    public String index(HttpSession session, Model model) {
        List<Jogador> jogadores = jogadorDao.findAll();

        model.addAttribute("jogadores", jogadores);
        configure(model);
        return "jogadores";
    }

    private void configure(Model model) {
        model.addAttribute("userSection", Boolean.TRUE);
        model.addAttribute("pageTitle", "Jogadores");
    }
}
