package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE7000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE7000Mapper {
    List<PJTE7000DTO> select_7000_01(PJTE7000DTO PJTE7000) throws Exception;
}
