package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE4000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE4000Mapper {
    /* select */
    List<PJTE4000DTO> select_4000_01(PJTE4000DTO PJTE4000) throws Exception;

    /* update */
    boolean  update_4000_01(PJTE4000DTO PJTE4000) throws Exception;

    /* insert */
    boolean  insert_4000_01(PJTE4000DTO PJTE4000) throws Exception;
}
