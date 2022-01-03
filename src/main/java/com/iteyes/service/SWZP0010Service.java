package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.board.BoardDTO;
import com.iteyes.dto.pms.SWZP0010DTO;

public interface SWZP0010Service {
	List<SWZP0010DTO> select_0010(SWZP0010DTO swzp0010) throws Exception ;
	/*등록*/
	boolean insert_0010(SWZP0010DTO swzp0010) throws Exception ;
	/*수정*/
	boolean update_0010(SWZP0010DTO swzp0010) throws Exception ;
	/*삭제*/
	boolean delete_0010(SWZP0010DTO swzp0010) throws Exception ;
}
