package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9200DTO;
import com.iteyes.mapper.pms.PJTE9200Mapper;
import com.iteyes.service.PJTE9200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9200ServiceImpl implements PJTE9200Service {
    @Autowired
    private PJTE9200Mapper pjte9200Mapper;

    /* select */
    @Override
    public List<PJTE9200DTO> select_9200_01(PJTE9200DTO PJTE9200) throws Exception {

        return pjte9200Mapper.select_9200_01(PJTE9200);
    }

    /* 저장 전 체크 save_yn */
    @Override
    public List<PJTE9200DTO> select_9200_02(PJTE9200DTO PJTE9200) throws Exception {

        return pjte9200Mapper.select_9200_02(PJTE9200);
    }

    /* update */
    @Override
    public boolean update_9200_01(PJTE9200DTO PJTE9200) throws Exception {

        return pjte9200Mapper.update_9200_01(PJTE9200);
    }

    /* insert */
    @Override
    public boolean insert_9200_01(PJTE9200DTO PJTE9200) throws Exception {

        return pjte9200Mapper.insert_9200_01(PJTE9200);
    }

    /* delete */
    @Override
    public boolean delete_9200_01(PJTE9200DTO PJTE9200) throws Exception {

        return pjte9200Mapper.delete_9200_01(PJTE9200);
    }
}
