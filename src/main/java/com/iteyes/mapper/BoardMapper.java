package com.iteyes.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iteyes.dto.board.BoardDTO;

@Mapper
public interface BoardMapper {
	List<BoardDTO> select() throws Exception;
	long ins(BoardDTO dto) throws Exception;
}
