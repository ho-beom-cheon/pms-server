package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.mapper.pms.PJTE9000Mapper;
import com.iteyes.service.PJTE9000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9000ServiceImpl implements PJTE9000Service {
    @Autowired
    private PJTE9000Mapper pjte9000Mapper;

    @Override
    public List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_01(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_02(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_03(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_03(PJTE9000);

    }

    @Override
    public boolean insert_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_01(PJTE9000);

    }

    @Override
    public boolean update_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.update_9000_01(PJTE9000);

    }

    @Override
    public boolean insert_9000_03(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_03(PJTE9000);

    }

    @Override
    public boolean update_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.update_9000_02(PJTE9000);

    }

    @Override
    public boolean delete_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_01(PJTE9000);

    }

    @Override
    public boolean insert_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_02(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_50(PJTE9000);

    }

    @Override
    public boolean delete_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_50(PJTE9000);

    }

    @Override
    public boolean insert_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_50(PJTE9000);

    }

    @Override
    public boolean delete_9000_51(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_51(PJTE9000);

    }

    @Override
    public boolean insert_9000_51(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_51(PJTE9000);

    }
}
