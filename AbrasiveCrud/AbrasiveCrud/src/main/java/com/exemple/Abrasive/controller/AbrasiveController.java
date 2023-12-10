package com.exemple.Abrasive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exemple.Abrasive.domain.Abrasive; // Modificarea este aici
import com.exemple.Abrasive.service.AbrasiveService;

@Controller
public class AbrasiveController {

    @Autowired
    private AbrasiveService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
    	List<Abrasive> listabrasive = service.listAll();
		model.addAttribute("listabrasive", listabrasive);
		System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
    	model.addAttribute("abrasive", new Abrasive());
        return "new";
    }

    @PostMapping("/save")
    public String saveAbrasive(@ModelAttribute("abrasive") Abrasive std) {
    	service.save(std);
        return "redirect:/";
    }

    @GetMapping("/edit/{cod}")
    public ModelAndView edit(@PathVariable int cod) {
        ModelAndView mav = new ModelAndView("new");
        Abrasive std = service.get(cod);
        mav.addObject("abrasive", std);
        return mav;
    }

    @GetMapping("/delete/{cod}")
    public String deleteAbrasive(@PathVariable int cod) {
        service.delete(cod);
        return "redirect:/";
    }
}