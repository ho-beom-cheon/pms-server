package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE2110DTO;
import com.iteyes.mapper.pms.PJTE2110Mapper;
import com.iteyes.service.PJTE2110Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE2110ServiceImpl implements PJTE2110Service {
    @Autowired
    private PJTE2110Mapper pjte2110Mapper;

    @Override
    public List<PJTE2110DTO> select_2110_01(PJTE2110DTO PJTE2110) throws Exception {

        return pjte2110Mapper.select_2110_01(PJTE2110);

    }
}
