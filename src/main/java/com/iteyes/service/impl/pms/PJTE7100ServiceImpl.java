package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE2100DTO;
import com.iteyes.dto.pms.PJTE7100DTO;
import com.iteyes.mapper.pms.PJTE7100Mapper;
import com.iteyes.service.PJTE7100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE7100ServiceImpl implements PJTE7100Service {
    @Autowired
    private PJTE7100Mapper pjte7100Mapper;

    @Override
    public List<PJTE7100DTO> select_7100_01(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.select_7100_01(PJTE7100);

    }

    @Override
    public List<PJTE7100DTO> select_7100_02(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.select_7100_02(PJTE7100);

    }

    @Override
    public List<PJTE7100DTO> select_7100_03(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.select_7100_03(PJTE7100);

    }

    @Override
    public boolean insert_7100_01(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.insert_7100_01(PJTE7100);

    }

    @Override
    public boolean update_7100_01(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.update_7100_01(PJTE7100);
    }

    @Override
    public boolean update_7100_02(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.update_7100_02(PJTE7100);

    }

    /* delete */
    @Override
    public boolean delete_7100_01(PJTE7100DTO PJTE7100) throws Exception {

        return pjte7100Mapper.delete_7100_01(PJTE7100);
    }

}
