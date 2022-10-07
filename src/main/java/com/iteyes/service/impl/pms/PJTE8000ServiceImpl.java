package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE4000DTO;
import com.iteyes.dto.pms.PJTE8000DTO;
import com.iteyes.mapper.pms.PJTE8000Mapper;
import com.iteyes.service.PJTE8000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE8000ServiceImpl implements PJTE8000Service{
    @Autowired
    private PJTE8000Mapper pjte8000Mapper;

    /* select */
    @Override
    public List<PJTE8000DTO> select_8000_01(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.select_8000_01(PJTE8000);
    }

    @Override
    public List<PJTE8000DTO> select_8000_02(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.select_8000_02(PJTE8000);
    }

    @Override
    public List<PJTE8000DTO> select_8000_03(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.select_8000_03(PJTE8000);
    }

    @Override
    public List<PJTE8000DTO> select_8000_04(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.select_8000_04(PJTE8000);
    }

    /* insert */
    @Override
    public boolean insert_8000_01(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.insert_8000_01(PJTE8000);
    }
    /* update */
    @Override
    public boolean update_8000_01(PJTE8000DTO PJTE8000) throws Exception {

        return pjte8000Mapper.update_8000_01(PJTE8000);
    }

}
