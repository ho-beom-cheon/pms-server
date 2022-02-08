package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9001DTO;
import com.iteyes.mapper.pms.PJTE9001Mapper;
import com.iteyes.service.PJTE9001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9001ServiceImpl implements PJTE9001Service {
    @Autowired
    private PJTE9001Mapper PJTE9001Mapper;

    @Override
    public List<PJTE9001DTO> select_0000(PJTE9001DTO PJTE9001) throws Exception {

        return PJTE9001Mapper.select_0000_01(PJTE9001);
    }

    @Override
    public List<PJTE9001DTO> select_9001_01(PJTE9001DTO PJTE9001) throws Exception {

        return PJTE9001Mapper.select_9001_01(PJTE9001);
    }

}
