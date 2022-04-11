package com.iteyes.service;

import com.iteyes.dto.pms.PJTE9110DTO;

import java.util.List;

public interface PJTE9110Service {
    /*그리드1 조회*/
    List<PJTE9110DTO> select_9110_01(PJTE9110DTO PJTE9110)  throws Exception;
}
