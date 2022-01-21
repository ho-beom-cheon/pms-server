package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE1000DTO;
import com.iteyes.mapper.pms.PJTE1000Mapper;
import com.iteyes.service.PJTE1000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PJTE1000ServiceImpl implements PJTE1000Service {
    @Autowired
    private PJTE1000Mapper PJTE1000Mapper;

    @Override
    public List<PJTE1000DTO> select_1000_01(PJTE1000DTO PJTE1000) throws Exception {

        List<PJTE1000DTO> list = PJTE1000Mapper.select_1000_01(PJTE1000);

        return list;
    }
}
