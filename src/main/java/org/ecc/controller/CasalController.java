package org.ecc.controller;

import org.ecc.bo.CasalBO;
import org.ecc.entity.CasalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping(path = "/v1/casal")
public class CasalController extends BaseController<CasalEntity, Long> {

    private final CasalBO casalBO;

    @Autowired
    protected CasalController(CasalBO casalBO, CasalBO casalBO1) {
        super(casalBO);
        this.casalBO = casalBO1;
    }

    @GetMapping("/form")
    public String exibirFormulario(Model model) {
        model.addAttribute("casal", new CasalEntity());
        return "modulos/casal/form_casal"; // Nome do template
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<Long> saveObject(@Valid @RequestBody CasalEntity casal) throws Exception {
        Long id = casalBO.manterObject(casal);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}