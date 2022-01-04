package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0060DTO;
import com.iteyes.mapper.pms.SWZP0060Mapper;
import com.iteyes.service.SWZP0060Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0060ServiceImpl implements SWZP0060Service {
    @Autowired
    private SWZP0060Mapper swzp0060Mapper;

    /* select */
    @Override
    public List<SWZP0060DTO> select_0060(SWZP0060DTO SWZP0060) throws Exception {

        return swzp0060Mapper.select_0060_01(SWZP0060);
    }

    /* update */
    @Override
    public boolean update_0060(SWZP0060DTO SWZP0060) throws Exception {
       
        return swzp0060Mapper.update_0060_01(SWZP0060);
    }
}
