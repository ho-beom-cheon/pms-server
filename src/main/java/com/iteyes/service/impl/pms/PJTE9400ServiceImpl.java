package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9400DTO;
import com.iteyes.mapper.pms.PJTE9400Mapper;
import com.iteyes.service.PJTE9400Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9400ServiceImpl implements PJTE9400Service {
    @Autowired
    private PJTE9400Mapper pjte9400Mapper;

    @Override
    public List<PJTE9400DTO> select_9400_01(PJTE9400DTO PJTE9400) throws Exception {

        return pjte9400Mapper.select_9400_01(PJTE9400);

    }
    @Override
    public boolean insert_9400_01(PJTE9400DTO PJTE9400) throws Exception {

        return pjte9400Mapper.insert_9400_01(PJTE9400);

    }


    @Override
    public boolean update_9400_01(PJTE9400DTO PJTE9400) throws Exception {

        return pjte9400Mapper.update_9400_01(PJTE9400);

    }

    @Override
    public boolean update_9400_02(PJTE9400DTO PJTE9400) throws Exception {

        return pjte9400Mapper.update_9400_02(PJTE9400);

    }

}
