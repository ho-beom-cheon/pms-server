package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9110DTO;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9110Mapper {
    /*그리드1 조회*/
    List<PJTE9110DTO> select_9110_01(PJTE9110DTO PJTE9110) throws Exception;
}

