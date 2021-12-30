package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0100DTO;
import com.iteyes.mapper.pms.SWZP0100Mapper;
import com.iteyes.service.SWZP0100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0100ServiceImpl implements SWZP0100Service {
    @Autowired
    private SWZP0100Mapper swzp0100Mapper;

    @Override
    public List<SWZP0100DTO> select_0100(SWZP0100DTO SWZP0100) throws Exception {

        return swzp0100Mapper.select_0100_01(SWZP0100);

    }
}
