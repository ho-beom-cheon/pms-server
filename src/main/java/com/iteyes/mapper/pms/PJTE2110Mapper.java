package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE2110DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE2110Mapper {
    List<PJTE2110DTO> select_2110_01(PJTE2110DTO PJTE2110) throws Exception;
    List<PJTE2110DTO> select_2110_02(PJTE2110DTO PJTE2110) throws Exception;
    List<PJTE2110DTO> select_2110_03(PJTE2110DTO PJTE2110) throws Exception;
    List<PJTE2110DTO> select_2110_04(PJTE2110DTO PJTE2110) throws Exception;
}
