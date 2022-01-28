package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE1000DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE1000Mapper {
    /* TO-DO조회시 필요한 일수 select */
    List<PJTE1000DTO> select_1000_01(PJTE1000DTO PJTE1000) throws Exception;
    /* grid1 select */
    List<PJTE1000DTO> select_1000_02(PJTE1000DTO PJTE1000) throws Exception;
    /* grid2 select */
    List<PJTE1000DTO> select_1000_03(PJTE1000DTO PJTE1000) throws Exception;
    /* grid3 select */
    List<PJTE1000DTO> select_1000_04(PJTE1000DTO PJTE1000) throws Exception;

    /* update, delete */
    boolean delete_1000_01(PJTE1000DTO PJTE1000) throws Exception;

    /* insert */
    boolean insert_1000_01(PJTE1000DTO PJTE1000) throws Exception;

}
