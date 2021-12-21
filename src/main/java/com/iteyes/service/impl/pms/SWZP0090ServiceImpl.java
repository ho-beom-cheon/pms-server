package com.iteyes.service.impl.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.pms.SWZP0090DTO;
import com.iteyes.mapper.pms.SWZP0090Mapper;
import com.iteyes.service.SWZP0090Service;

@Service
public class SWZP0090ServiceImpl implements SWZP0090Service{
	@Autowired
	private SWZP0090Mapper swzp0090Mapper;

	@Override
	public List<SWZP0090DTO> select_0090_01() throws Exception {
		return swzp0090Mapper.select_0090_01();
	}
}
