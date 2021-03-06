package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE2110DTO;
import com.iteyes.dto.pms.PJTE2210DTO;
import com.iteyes.mapper.pms.PJTE2210Mapper;
import com.iteyes.service.PJTE2210Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE2210ServiceImpl implements PJTE2210Service {
    //
    @Autowired
    private PJTE2210Mapper pjte2210Mapper;

    @Override
    public List<PJTE2210DTO> select_2210(PJTE2210DTO PJTE2210) throws Exception {
        List<PJTE2210DTO> list = new ArrayList<>();

        if(PJTE2210.getGubun().equals("1")) {
            list = pjte2210Mapper.select_2210_01(PJTE2210);
        }
        if(PJTE2210.getGubun().equals("2")) {
            list = pjte2210Mapper.select_2210_02(PJTE2210);
        }
        if(PJTE2210.getGubun().equals("3")) {
            list = pjte2210Mapper.select_2210_03(PJTE2210);
        }
        if(PJTE2210.getGubun().equals("4")) {
            list = pjte2210Mapper.select_2210_04(PJTE2210);
        }
        return list;
    }
}
