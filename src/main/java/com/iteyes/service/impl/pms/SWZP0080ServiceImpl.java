package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0080DTO;
import com.iteyes.mapper.pms.SWZP0080Mapper;
import com.iteyes.service.SWZP0080Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0080ServiceImpl implements SWZP0080Service {
    @Autowired
    private SWZP0080Mapper swzp0080Mapper;

    @Override
    public List<SWZP0080DTO> select_0080(SWZP0080DTO SWZP0080) throws Exception {

        return swzp0080Mapper.select_0080_01(SWZP0080);

    }
}
