package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9003DTO;
import com.iteyes.mapper.pms.PJTE9003Mapper;
import com.iteyes.service.PJTE9003Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9003ServiceImpl implements PJTE9003Service {
    @Autowired
    private PJTE9003Mapper pjte9003Mapper;

    @Override
    public List<PJTE9003DTO> select_9003_01(PJTE9003DTO PJTE9003) throws Exception {
        return pjte9003Mapper.select_9003_01(PJTE9003);
    }
}
