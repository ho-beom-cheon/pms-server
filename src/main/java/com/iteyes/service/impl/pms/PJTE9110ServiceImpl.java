package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9110DTO;
import com.iteyes.mapper.pms.PJTE9110Mapper;
import com.iteyes.service.PJTE9110Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9110ServiceImpl implements PJTE9110Service {
    @Autowired
    private PJTE9110Mapper pjte9110Mapper;
    @Override
    public List<PJTE9110DTO> select_9110_01(PJTE9110DTO PJTE9110) throws Exception {
        List<PJTE9110DTO> list = pjte9110Mapper.select_9110_01(PJTE9110);
        return list;
    }
}
