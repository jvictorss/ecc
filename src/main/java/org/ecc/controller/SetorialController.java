package org.ecc.controller;

import org.ecc.bo.DioceseBO;
import org.ecc.bo.SetorialBO;
import org.ecc.entity.DioceseEntity;
import org.ecc.entity.SetorialEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/v1/setorial")
public class SetorialController extends BaseController<SetorialEntity, Long> {

    private final DioceseBO dioceseBO;
    private final SetorialBO setorialBO;

    @Autowired
    protected SetorialController(SetorialBO setorialBO, DioceseBO dioceseBO) {
        super(setorialBO);
        this.setorialBO = setorialBO;
        this.dioceseBO = dioceseBO;
    }

    @GetMapping("/list")
    public String listSetorial(Model model, HttpSession session) {
//        model.addAttribute("setoriais", setorialBO.findAll()); // Lista de setoriais
        session.setAttribute("nameApi", "Gerenciamento de dados ECC");
        return "/modulos/setorial/list_setorial";
    }

//    @GetMapping("/form")
//    public String showSetorialForm(Model model) {
//        model.addAttribute("setorial", new SetorialEntity());
//        model.addAttribute("dioceses", dioceseBO.findAll());
//        return "/modulos/setorial/form_setorial";
//    }
}