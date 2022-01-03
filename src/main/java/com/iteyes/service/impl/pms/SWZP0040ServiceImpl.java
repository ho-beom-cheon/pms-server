package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0040DTO;
import com.iteyes.mapper.pms.SWZP0040Mapper;
import com.iteyes.service.SWZP0040Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0040ServiceImpl implements SWZP0040Service{
	@Autowired
	private SWZP0040Mapper swzp0040Mapper;
	
	@Override
	public List<SWZP0040DTO> select_0040(SWZP0040DTO SWZP0040) throws Exception {
		return swzp0040Mapper.select_0040_01(SWZP0040);
	}
}
