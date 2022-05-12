package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE7100DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE7100Mapper {
    List<PJTE7100DTO> select_7100_01(PJTE7100DTO PJTE7100) throws Exception;
    List<PJTE7100DTO> select_7100_02(PJTE7100DTO PJTE7100) throws Exception;

    boolean update_7100_01(PJTE7100DTO PJTE7100) throws Exception;
    boolean insert_7100_01(PJTE7100DTO PJTE7100) throws Exception;

}
