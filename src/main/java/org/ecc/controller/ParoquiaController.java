package org.ecc.controller;

import org.ecc.bo.ParoquiaBO;
import org.ecc.entity.ParoquiaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/v1/paroquia")
public class ParoquiaController extends BaseController<ParoquiaEntity, Long> {

    private final ParoquiaBO paroquiaBO;

    @Autowired
    protected ParoquiaController(ParoquiaBO paroquiaBO) {
        super(paroquiaBO);
        this.paroquiaBO = paroquiaBO;
    }

    @GetMapping
    public String showParoquia(Model model, HttpSession session){
        model.addAttribute("lk4",true);
        session.setAttribute("nameApi", "Gerenciamento de dados ECC");
        System.out.println("Session nameAPI: " + session.getAttribute("nameAPI"));
        return "/modulos/paroquia/list_paroquia";
    }

}