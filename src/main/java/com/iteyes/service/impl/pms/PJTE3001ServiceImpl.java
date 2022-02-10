
package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE3001DTO;
import com.iteyes.mapper.pms.PJTE3001Mapper;
import com.iteyes.service.PJTE3001Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE3001ServiceImpl implements PJTE3001Service {
    @Autowired
    private PJTE3001Mapper pjte3001Mapper;

    /* combo */
    @Override
    public List<PJTE3001DTO> select_0000_01(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.select_0000_01(PJTE3001);
    }
    @Override
    public List<PJTE3001DTO> select_0000_02(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.select_0000_02(PJTE3001);
    }
    @Override
    public List<PJTE3001DTO> select_0000_03(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.select_0000_03(PJTE3001);
    }
    @Override
    public List<PJTE3001DTO> select_0000_04(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.select_0000_04(PJTE3001);
    }

    /* select */
    @Override
    public List<PJTE3001DTO> select_3001_01(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.select_3001_01(PJTE3001);
    }

    /* update */
    @Override
    public boolean update_3001_01(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.update_3001_01(PJTE3001);
    }

    /* insert */
    @Override
    public boolean insert_3001_01(PJTE3001DTO PJTE3001) throws Exception {

        return pjte3001Mapper.insert_3001_01(PJTE3001);
    }
}
