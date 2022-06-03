package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE8100DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE8100Mapper {
    /* select */
    List<PJTE8100DTO> select_8100_01(PJTE8100DTO PJTE8100) throws Exception;

    /* insert */
    boolean  insert_8100_01(PJTE8100DTO PJTE8100) throws Exception;
    /* update */
    boolean  update_8100_01(PJTE8100DTO PJTE8100) throws Exception;
    /* update */
    boolean  update_8100_02(PJTE8100DTO PJTE1000) throws Exception;
}
