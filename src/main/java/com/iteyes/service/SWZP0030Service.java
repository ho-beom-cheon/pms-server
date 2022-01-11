package com.iteyes.service;

import java.util.List;

import com.iteyes.dto.pms.SWZP0030DTO;

public interface SWZP0030Service {
	List<SWZP0030DTO> select_0030(SWZP0030DTO SWZP0030) throws Exception ;
	/*등록*/
	boolean insert_0030(SWZP0030DTO swzp0030) throws Exception ;
	/*수정*/
	boolean update_0030(SWZP0030DTO swzp0030) throws Exception ;
	/*삭제*/
	boolean delete_0030(SWZP0030DTO swzp0030) throws Exception ;
}
