package com.iteyes.service.impl.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.pms.SWZP0030DTO;
import com.iteyes.mapper.pms.SWZP0030Mapper;
import com.iteyes.service.SWZP0030Service;

@Service
public class SWZP0030ServiceImpl implements SWZP0030Service{
	@Autowired
	private SWZP0030Mapper swzp0030Mapper;

	@Override
	public List<SWZP0030DTO> select_0030(SWZP0030DTO SWZP0030) throws Exception {

		return swzp0030Mapper.select_0030_01(SWZP0030);
	}

	@Override
	public List<SWZP0030DTO> update_0030(SWZP0030DTO SWZP0030) throws Exception {

		return swzp0030Mapper.update_0030_01(SWZP0030);
	}

}
