package com.iteyes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.MainDTO;
import com.iteyes.dto.board.BoardDTO;
import com.iteyes.mapper.BoardMapper;
import com.iteyes.mapper.MainMapper;
import com.iteyes.service.MainService;

@Service
public class MainServiceImpl implements MainService{

	@Autowired
	private MainMapper mainMapper;

	@Override
	public List<MainDTO> userInfo_0010(MainDTO mainDto) throws Exception {
		return mainMapper.select_0120_01(mainDto);
	}
}
