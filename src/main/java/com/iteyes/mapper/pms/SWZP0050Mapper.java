package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0050DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0050Mapper {
	List<SWZP0050DTO> select_0050_01(SWZP0050DTO SWZP0050) throws Exception;

}
