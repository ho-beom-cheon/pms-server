package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.SWZP0050DTO;
import com.iteyes.mapper.pms.SWZP0050Mapper;
import com.iteyes.service.SWZP0050Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SWZP0050ServiceImpl implements SWZP0050Service{
	@Autowired
	private SWZP0050Mapper swzp0050Mapper;

	@Override
	public List<SWZP0050DTO> select_0050(SWZP0050DTO SWZP0050) throws Exception {

		return swzp0050Mapper.select_0050_01(SWZP0050);
	}
}
