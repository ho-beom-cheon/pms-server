package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0060DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0060Mapper {
    /* select */
    List<SWZP0060DTO> select_0060_01(SWZP0060DTO SWZP0060) throws Exception;

    /* update */
    boolean  update_0060_01(SWZP0060DTO SWZP0060) throws Exception;

    /* insert */
    boolean  insert_0060_01(SWZP0060DTO SWZP0060) throws Exception;
}
