package com.sj.mes.controller;

import com.sj.mes.service.IMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MesController {

    @Autowired
    private IMesService mesService;

    @RequestMapping("/mes")
    public String mes(){
        return mesService.mes();
    }

    @RequestMapping("/mes/erp")
    public String mesErp(){
        return mesService.erp();
    }
}
