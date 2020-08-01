package com.hr.service.impl;

import com.hr.mapper.BeOrderMapper;
import com.hr.service.BeOrederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeOrederServiceimpl implements BeOrederService{

    @Autowired
    private BeOrderMapper beOrderMapper;

    @Override
    public void addKh() {
        beOrderMapper.addKh();
    }
}
