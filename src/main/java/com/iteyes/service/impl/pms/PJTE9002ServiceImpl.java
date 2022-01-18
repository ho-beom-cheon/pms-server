package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9002DTO;
import com.iteyes.mapper.pms.PJTE9002Mapper;
import com.iteyes.service.PJTE9002Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9002ServiceImpl implements PJTE9002Service {
    @Autowired
    private PJTE9002Mapper pjte9002Mapper;

    @Override
    public List<PJTE9002DTO> select_9002_01(PJTE9002DTO PJTE9002) throws Exception {

        return pjte9002Mapper.select_9002_01(PJTE9002);

    }
    @Override
    public boolean insert_9002_01(PJTE9002DTO PJTE9002) throws Exception {

        return pjte9002Mapper.insert_9002_01(PJTE9002);

    }
}
