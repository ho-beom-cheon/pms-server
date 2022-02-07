package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE3001DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE3001Mapper {
    /* select */
    List<PJTE3001DTO> select_3001_01(PJTE3001DTO PJTE3001) throws Exception;

    /* update */
    boolean  update_3001_01(PJTE3001DTO PJTE3001) throws Exception;

    /* insert */
    boolean  insert_3001_01(PJTE3001DTO PJTE3001) throws Exception;
}
