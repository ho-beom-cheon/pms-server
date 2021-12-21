package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.board.BoardDTO;

public interface BoardService {
	List<BoardDTO> select() throws Exception ;
	boolean ins(BoardDTO dto) throws Exception ;
}
