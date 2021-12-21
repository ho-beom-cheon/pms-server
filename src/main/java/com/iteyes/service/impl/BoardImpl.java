package com.iteyes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iteyes.dto.board.BoardDTO;
import com.iteyes.mapper.BoardMapper;
import com.iteyes.service.BoardService;

@Service
public class BoardImpl implements BoardService{
	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardDTO> select() throws Exception {
		return boardMapper.select();
	}

	@Override
	public boolean ins(BoardDTO dto) throws Exception {
		return true;
	}

//	@Override
//	public long ins(BoardDTO dto) throws Exception {
//		return boardMapper.ins(dto);
//	}
}
