package com.iteyes.service.impl.pms;

import java.util.List;

import com.iteyes.mapper.pms.PJTE5000Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.pms.PJTE5000DTO;
import com.iteyes.service.PJTE5000Service;

@Service
public class PJTE5000ServiceImpl implements PJTE5000Service {
    @Autowired
    private PJTE5000Mapper pjte5000Mapper;

    @Override
    public List<PJTE5000DTO> select_5000_01() throws Exception {

        return pjte5000Mapper.select_5000_01();

    }
}
