package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE2100DTO;
import com.iteyes.dto.pms.PJTE2110DTO;
import com.iteyes.mapper.pms.PJTE2110Mapper;
import com.iteyes.service.PJTE2110Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PJTE2110ServiceImpl implements PJTE2110Service {
    @Autowired
    private PJTE2110Mapper pjte2110Mapper;

    @Override
    public List<PJTE2110DTO> select_2110(PJTE2110DTO PJTE2110) throws Exception {
        List<PJTE2110DTO> list = new ArrayList<>();

        if(PJTE2110.getGubun().equals("1")) {
            list = pjte2110Mapper.select_2110_01(PJTE2110);
        }
        if(PJTE2110.getGubun().equals("2")) {
            list = pjte2110Mapper.select_2110_02(PJTE2110);
        }
        if(PJTE2110.getGubun().equals("3")) {
            list = pjte2110Mapper.select_2110_03(PJTE2110);
        }
        if(PJTE2110.getGubun().equals("4")) {
            list = pjte2110Mapper.select_2110_04(PJTE2110);
        }
        return list;

    }
}
