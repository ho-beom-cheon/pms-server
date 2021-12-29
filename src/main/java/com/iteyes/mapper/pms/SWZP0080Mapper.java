package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0080DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0080Mapper {
    List<SWZP0080DTO> select_0080_01(SWZP0080DTO SWZP0080) throws Exception;
}
