package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9200DTO;

import java.util.List;

public interface PJTE9200Service {
    /* select */
    List<PJTE9200DTO> select_9200_01(PJTE9200DTO PJTE9200) throws Exception ;

    /* 저장 전 체크 save_yn */
    List<PJTE9200DTO> select_9200_02(PJTE9200DTO PJTE9200) throws Exception ;

    /* update */
    boolean update_9200_01(PJTE9200DTO PJTE9200) throws Exception;

    /* insert */
    boolean insert_9200_01(PJTE9200DTO PJTE9200) throws Exception;

    /* delete */
    boolean delete_9200_01(PJTE9200DTO PJTE9200) throws Exception;
}
