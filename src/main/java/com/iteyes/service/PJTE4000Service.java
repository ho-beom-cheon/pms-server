package com.iteyes.service;

import com.iteyes.dto.pms.PJTE4000DTO;

import java.util.List;

public interface PJTE4000Service {
    /* select */
    List<PJTE4000DTO> select_4000_01(PJTE4000DTO PJTE4000) throws Exception ;

    /* update */
    boolean update_4000_01(PJTE4000DTO PJTE4000) throws Exception;

    /* insert */
    boolean insert_4000_01(PJTE4000DTO PJTE4000) throws Exception;
}
