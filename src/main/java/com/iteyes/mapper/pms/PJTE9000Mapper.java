package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9000Mapper {
    List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception;
}
