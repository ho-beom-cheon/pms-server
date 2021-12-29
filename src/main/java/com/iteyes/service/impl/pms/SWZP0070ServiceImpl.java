package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0070DTO;
import com.iteyes.mapper.pms.SWZP0070Mapper;
import com.iteyes.service.SWZP0070Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0070ServiceImpl implements SWZP0070Service {
    @Autowired
    private SWZP0070Mapper swzp0070Mapper;

    @Override
    public List<SWZP0070DTO> select_0070(SWZP0070DTO SWZP0070) throws Exception {

        return swzp0070Mapper.select_0070_01(SWZP0070);

    }
}
