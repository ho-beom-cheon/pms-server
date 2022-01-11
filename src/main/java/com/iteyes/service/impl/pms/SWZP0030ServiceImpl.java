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
	
	/* create */
	@Override
	public boolean insert_0030(SWZP0030DTO swzp0030) throws Exception {

		return swzp0030Mapper.insert_0030_01(swzp0030);
	}

	/* update */
	@Override
	public boolean update_0030(SWZP0030DTO swzp0030) throws Exception {

		return swzp0030Mapper.update_0030_01(swzp0030);
	}

	/* delete */
	@Override
	public boolean delete_0030(SWZP0030DTO swzp0030) throws Exception {

		return swzp0030Mapper.update_0030_02(swzp0030);
	}
}
