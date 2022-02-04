package com.iteyes.service;

import com.iteyes.dto.pms.PJTE1000DTO;

import java.util.List;

public interface PJTE1000Service {
    /* TO-DO조회시 필요한 일수 select */
    List<PJTE1000DTO> select_1000_01(PJTE1000DTO PJTE1000) throws Exception;

    /* select */
    List<PJTE1000DTO> select_1000(PJTE1000DTO PJTE1000) throws Exception;

    /* update, delete */
    boolean update_1000_01(PJTE1000DTO PJTE1000) throws Exception;

    /* insert */
    boolean insert_1000_01(PJTE1000DTO PJTE1000) throws Exception;

}
