package com.sj.mes.service;

import com.sj.erp.service.IErpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesServiceImpl implements IMesService {

    @Autowired
    private IErpService erpService;

    @Override
    public String mes() {
        return "我是MES模块";
    }

    /**
     * mes 模块调用ERP模块
     * @return
     */
    @Override
    public String erp() {
        return erpService.erp();
    }
}
