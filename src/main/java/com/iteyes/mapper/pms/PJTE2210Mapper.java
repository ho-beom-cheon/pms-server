package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE2210DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//
@Mapper
public interface PJTE2210Mapper {
    List<PJTE2210DTO> select_2210_01(PJTE2210DTO PJTE2210) throws Exception;
    List<PJTE2210DTO> select_2210_02(PJTE2210DTO PJTE2210) throws Exception;
    List<PJTE2210DTO> select_2210_03(PJTE2210DTO PJTE2210) throws Exception;
    List<PJTE2210DTO> select_2210_04(PJTE2210DTO PJTE2210) throws Exception;
}
