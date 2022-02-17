package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9003DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9003Mapper {
    List<PJTE9003DTO> select_9003_01(PJTE9003DTO PJTE9003) throws Exception;
}
