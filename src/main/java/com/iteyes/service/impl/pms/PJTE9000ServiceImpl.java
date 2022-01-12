package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.mapper.pms.PJTE9000Mapper;
import com.iteyes.service.PJTE9000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9000ServiceImpl implements PJTE9000Service {
    @Autowired
    private PJTE9000Mapper pjte9000Mapper;

    @Override
    public List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_01(PJTE9000);

    }
}
