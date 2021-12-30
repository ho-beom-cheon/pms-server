package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0100DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0100Mapper {
    List<SWZP0100DTO> select_0100_01(SWZP0100DTO SWZP0100) throws Exception;
}
