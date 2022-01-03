package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0110DTO;
import com.iteyes.mapper.pms.SWZP0110Mapper;
import com.iteyes.service.SWZP0110Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0110ServiceImpl implements SWZP0110Service {
    @Autowired
    private SWZP0110Mapper swzp0110Mapper;

    @Override
    public List<SWZP0110DTO> select_0110(SWZP0110DTO SWZP0110) throws Exception {

        return swzp0110Mapper.select_0110_01(SWZP0110);

    }
}
