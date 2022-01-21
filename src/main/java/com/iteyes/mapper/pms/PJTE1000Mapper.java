package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE1000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE1000Mapper {
    List<PJTE1000DTO> select_1000_01(PJTE1000DTO PJTE1000) throws Exception;

//    List<PJTE1000DTO> select_1000_02(PJTE1000DTO PJTE1000) throws Exception;

}
