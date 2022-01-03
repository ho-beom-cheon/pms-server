package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0110DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0110Mapper {
    List<SWZP0110DTO> select_0110_01(SWZP0110DTO SWZP0110) throws Exception;
}
