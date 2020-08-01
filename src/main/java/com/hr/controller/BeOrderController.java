package com.hr.controller;

import com.hr.service.BeOrederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("beOreder")
public class BeOrderController {

    @Autowired
    private BeOrederService beOrederService;

    @RequestMapping("woliekai")
    public String woliekai(){

        return "workspace.html";
    }

    @RequestMapping("addKh")
    public String addKh(){

        beOrederService.addKh();

        return "page/be__request.html";
    }

}
