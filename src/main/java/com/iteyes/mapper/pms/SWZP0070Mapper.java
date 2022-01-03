package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0070DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0070Mapper {
    List<SWZP0070DTO> select_0070_01(SWZP0070DTO SWZP0070) throws Exception;
}
