package com.trabalho.controller;

import com.trabalho.model.Equipe;
import com.trabalho.model.Jogador;
import com.trabalho.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/equipes")
public class EquipeController {

    @Autowired
    EquipeService equipeService;

    @RequestMapping(value = { "list" })
    public String index(HttpSession session, Model model) {
        List<Equipe> equipes = equipeService.findAll();
        String eqName = null;

        model.addAttribute("eqName", eqName);
        model.addAttribute("equipes", equipes);

        configure(model);
        return "equipes";
    }

    @RequestMapping(value = { "detalhes" })
    public String listaJogadores(@RequestParam(value="id", required=true) Integer eqId, HttpSession session,
                                 Model model, HttpServletRequest request) {
        Equipe equipe = equipeService.findById(eqId);

        List<Jogador> jogadores = equipe.getJogadores();

        model.addAttribute("equipe", equipe);
        model.addAttribute("jogadores", jogadores);

        return "equipe-detalhes";
    }

    private void configure(Model model) {
        model.addAttribute("userSection", Boolean.TRUE);
        model.addAttribute("pageTitle", "Equipes");
    }
}
