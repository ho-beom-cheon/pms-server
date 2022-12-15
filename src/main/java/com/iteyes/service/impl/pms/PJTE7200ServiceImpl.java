package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE7200DTO;
import com.iteyes.mapper.pms.PJTE7200Mapper;
import com.iteyes.service.PJTE7200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PJTE7200ServiceImpl implements PJTE7200Service {
    @Autowired
    private PJTE7200Mapper pjte7200Mapper;

    @Override
    public List<PJTE7200DTO> select_7200_01(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.select_7200_01(PJTE7200);

    }

    @Override
    public List<PJTE7200DTO> select_7200_02(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.select_7200_02(PJTE7200);

    }

    @Override
    public List<PJTE7200DTO> select_7200_03(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.select_7200_03(PJTE7200);

    }

    @Override
    public boolean insert_7200_01(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.insert_7200_01(PJTE7200);

    }

    @Override
    public boolean insert_7200_02(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.insert_7200_21(PJTE7200);

    }

    @Override
    public boolean update_7200_01(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.update_7200_01(PJTE7200);
    }

    /* delete */
    @Override
    public boolean delete_7200_01(PJTE7200DTO PJTE7200) throws Exception {

        return pjte7200Mapper.delete_7200_01(PJTE7200);
    }

}
