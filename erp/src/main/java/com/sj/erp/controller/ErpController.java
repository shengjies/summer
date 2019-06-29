package com.sj.erp.controller;

import com.sj.erp.service.IErpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErpController {
    @Autowired
    private IErpService erpService;

    @RequestMapping("/erp")
    public String erp(){
        return erpService.erp();
    }
}
