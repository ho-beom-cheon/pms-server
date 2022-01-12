package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE7000DTO;
import com.iteyes.mapper.pms.PJTE7000Mapper;
import com.iteyes.service.PJTE7000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE7000ServiceImpl implements PJTE7000Service {
    @Autowired
    private PJTE7000Mapper pjte7000Mapper;

    @Override
    public List<PJTE7000DTO> select_7000_01(PJTE7000DTO PJTE7000) throws Exception {

        return pjte7000Mapper.select_7000_01(PJTE7000);

    }
}
