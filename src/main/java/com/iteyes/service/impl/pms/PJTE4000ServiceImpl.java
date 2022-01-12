package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE4000DTO;
import com.iteyes.mapper.pms.PJTE4000Mapper;
import com.iteyes.service.PJTE4000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE4000ServiceImpl implements PJTE4000Service {
    @Autowired
    private PJTE4000Mapper pjte4000Mapper;

    /* select */
    @Override
    public List<PJTE4000DTO> select_4000_01(PJTE4000DTO PJTE4000) throws Exception {

        return pjte4000Mapper.select_4000_01(PJTE4000);
    }

    /* update */
    @Override
    public boolean update_4000_01(PJTE4000DTO PJTE4000) throws Exception {

        return pjte4000Mapper.update_4000_01(PJTE4000);
    }

    /* insert */
    @Override
    public boolean insert_4000_01(PJTE4000DTO PJTE4000) throws Exception {

        return pjte4000Mapper.insert_4000_01(PJTE4000);
    }
}
