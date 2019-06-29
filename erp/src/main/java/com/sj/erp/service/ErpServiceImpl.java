package com.sj.erp.service;

import org.springframework.stereotype.Service;

@Service
public class ErpServiceImpl implements IErpService {
    @Override
    public String erp() {
        return "我是ERP模块";
    }
}
