package com.iteyes.service;

import com.iteyes.dto.pms.PJTE3001DTO;

import java.util.List;

public interface PJTE3001Service {
    /* select */
    List<PJTE3001DTO> select_3001_01(PJTE3001DTO PJTE3001) throws Exception ;

    /* update */
    boolean update_3001_01(PJTE3001DTO PJTE3001) throws Exception;

    /* insert */
    boolean insert_3001_01(PJTE3001DTO PJTE3001) throws Exception;
}
