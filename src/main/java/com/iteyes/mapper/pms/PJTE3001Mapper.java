package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE3001DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE3001Mapper {
    /* combo */
    List<PJTE3001DTO> select_0000_01(PJTE3001DTO PJTE3001) throws Exception;
    List<PJTE3001DTO> select_0000_02(PJTE3001DTO PJTE3001) throws Exception;
    List<PJTE3001DTO> select_0000_03(PJTE3001DTO PJTE3001) throws Exception;
    List<PJTE3001DTO> select_0000_04(PJTE3001DTO PJTE3001) throws Exception;

    /* mng_id가 있을 때 팝업 데이터 조회 select */
    List<PJTE3001DTO> select_3001_01(PJTE3001DTO PJTE3001) throws Exception;

    /* mng_id가 없을 때 신규 등록을 위한팝업 데이터 조회 select */
    List<PJTE3001DTO> select_3001_02(PJTE3001DTO PJTE3001) throws Exception;

    List<PJTE3001DTO> select_3001_03(PJTE3001DTO PJTE3001) throws Exception;

    /* update */
    boolean  update_3001_01(PJTE3001DTO PJTE3001) throws Exception;

    /* insert */
    boolean  insert_3001_01(PJTE3001DTO PJTE3001) throws Exception;
}
