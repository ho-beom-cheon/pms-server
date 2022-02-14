package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE8000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE8000Mapper {
    /* select */
    List<PJTE8000DTO> select_8000_01(PJTE8000DTO PJTE8000) throws Exception;
}
