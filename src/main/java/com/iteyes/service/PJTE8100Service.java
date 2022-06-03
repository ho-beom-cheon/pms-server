package com.iteyes.service;

import com.iteyes.dto.pms.PJTE8100DTO;

import java.util.List;

public interface PJTE8100Service {
    /* select */
    List<PJTE8100DTO> select_8100_01(PJTE8100DTO PJTE8100) throws Exception ;
    /* insert */
    boolean insert_8100_01(PJTE8100DTO PJTE8100) throws Exception;
    /* update */
    boolean update_8100_01(PJTE8100DTO PJTE8100) throws Exception;
    /* update */
    boolean update_8100_02(PJTE8100DTO PJTE8100) throws Exception;
}
