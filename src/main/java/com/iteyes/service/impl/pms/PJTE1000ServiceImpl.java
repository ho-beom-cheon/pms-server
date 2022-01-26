package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE1000DTO;
import com.iteyes.mapper.pms.PJTE1000Mapper;
import com.iteyes.service.PJTE1000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE1000ServiceImpl implements PJTE1000Service {
    @Autowired
    private PJTE1000Mapper pjte1000Mapper;

    @Override
    public List<PJTE1000DTO> select_1000_01(PJTE1000DTO PJTE1000) throws Exception {
        List<PJTE1000DTO> list01 = new ArrayList<>();

        list01 = pjte1000Mapper.select_1000_01(PJTE1000);

        return list01;
    }

    @Override
    public List<PJTE1000DTO> select_1000(PJTE1000DTO PJTE1000) throws Exception {

        List<PJTE1000DTO> list = new ArrayList<>();

        if(PJTE1000.getGubun().equals("1")) {
            list = pjte1000Mapper.select_1000_02(PJTE1000);
        }
        if(PJTE1000.getGubun().equals("2")) {
            List<PJTE1000DTO> list02 = new ArrayList<>();
            list02 = pjte1000Mapper.select_1000_02(PJTE1000);

            PJTE1000.setTodo_cd(list02.get(Integer.parseInt(PJTE1000.getRowNum())).getTodo_cd());

            list = pjte1000Mapper.select_1000_03(PJTE1000);
        }
        if(PJTE1000.getGubun().equals("3")) {
            list = pjte1000Mapper.select_1000_04(PJTE1000);
        }

        return list;

    }

    /* update, delete */
    @Override
    public boolean delete_1000_01(PJTE1000DTO PJTE1000) throws Exception {

        return pjte1000Mapper.delete_1000_01(PJTE1000);
    }

    /* insert */
    @Override
    public boolean insert_1000_01(PJTE1000DTO PJTE1000) throws Exception {

        return pjte1000Mapper.insert_1000_01(PJTE1000);
    }
}
