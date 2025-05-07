package org.ecc.controller;

import org.ecc.bo.DioceseBO;
import org.ecc.entity.DioceseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/v1/diocese")
public class DioceseController extends BaseController<DioceseEntity, Long> {

    private final DioceseBO dioceseBO;

    @Autowired
    protected DioceseController(DioceseBO dioceseBO, DioceseBO dioceseBO1) {
        super(dioceseBO);
        this.dioceseBO = dioceseBO1;
    }

    @GetMapping
    public String showDiocese(Model model, HttpSession session){
        model.addAttribute("lk2",true);
        session.setAttribute("nameApi", "Gerenciamento de dados ECC");
        System.out.println("Session nameAPI: " + session.getAttribute("nameAPI"));
        return "/modulos/diocese/list_diocese";
    }

}