package com.iteyes.service;

import com.iteyes.dto.pms.PJTE4000DTO;
import com.iteyes.dto.pms.PJTE8000DTO;

import java.util.List;

public interface PJTE8000Service {
    /* select */
    List<PJTE8000DTO> select_8000_01(PJTE8000DTO PJTE8000) throws Exception ;

    List<PJTE8000DTO> select_8000_02(PJTE8000DTO PJTE8000) throws Exception ; //지난주 주간보고 조회

    List<PJTE8000DTO> select_8000_03(PJTE8000DTO PJTE8000) throws Exception ; //지난주 주간보고 조회
    /* insert */
    boolean insert_8000_01(PJTE8000DTO PJTE8000) throws Exception;
    /* update */
    boolean update_8000_01(PJTE8000DTO PJTE8000) throws Exception;
}
