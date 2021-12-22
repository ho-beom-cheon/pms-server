package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.SWZP0040DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SWZP0040Mapper {
	List<SWZP0040DTO> select_0040_01(SWZP0040DTO SWZP0040) throws Exception;

}
