package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE8100DTO;
import com.iteyes.mapper.pms.PJTE8100Mapper;
import com.iteyes.service.PJTE8100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE8100ServiceImpl implements PJTE8100Service{
    @Autowired
    private PJTE8100Mapper pjte8100Mapper;

    /* select */
    @Override
    public List<PJTE8100DTO> select_8100_01(PJTE8100DTO PJTE8100) throws Exception {

        return pjte8100Mapper.select_8100_01(PJTE8100);
    }

    /* insert */
    @Override
    public boolean insert_8100_01(PJTE8100DTO PJTE8100) throws Exception {

        return pjte8100Mapper.insert_8100_01(PJTE8100);
    }
    /* update */
    @Override
    public boolean update_8100_01(PJTE8100DTO PJTE8100) throws Exception {

        return pjte8100Mapper.update_8100_01(PJTE8100);
    }

    /* update */
    @Override
    public boolean update_8100_02(PJTE8100DTO PJTE8100) throws Exception {

        return pjte8100Mapper.update_8100_02(PJTE8100);
    }

}
