package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9005DTO;
import com.iteyes.mapper.pms.PJTE9005Mapper;
import com.iteyes.service.PJTE9005Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9005ServiceImpl implements PJTE9005Service {
	@Autowired
	private PJTE9005Mapper pjte9005Mapper;

	@Override
	public List<PJTE9005DTO> select_9005_01(PJTE9005DTO PJTE9005) throws Exception {
		List<PJTE9005DTO> list = pjte9005Mapper.select_9005_01(PJTE9005);
		return list;
	}

	@Override
	public List<PJTE9005DTO> select_9005_02(PJTE9005DTO PJTE9005) throws Exception {
		List<PJTE9005DTO> list = pjte9005Mapper.select_9005_02(PJTE9005);
		return list;
	}

	@Override
	public List<PJTE9005DTO> select_9005_03(PJTE9005DTO PJTE9005) throws Exception {
		List<PJTE9005DTO> list = pjte9005Mapper.select_9005_03(PJTE9005);
		return list;
	}

	@Override
	public List<PJTE9005DTO> select_9005_04(PJTE9005DTO PJTE9005) throws Exception {
		List<PJTE9005DTO> list = pjte9005Mapper.select_9005_04(PJTE9005);
		return list;
	}

	/* create */
	@Override
	public boolean insert_9005_01(PJTE9005DTO PJTE9005) throws Exception {

		return pjte9005Mapper.insert_9005_01(PJTE9005);
	}

	/* update */
	@Override
	public boolean update_9005_01(PJTE9005DTO PJTE9005) throws Exception {

		return pjte9005Mapper.update_9005_01(PJTE9005);
	}

	/* delete */
	@Override
	public boolean delete_9005_01(PJTE9005DTO PJTE9005) throws Exception {

		return pjte9005Mapper.delete_9005_01(PJTE9005);
	}
}
