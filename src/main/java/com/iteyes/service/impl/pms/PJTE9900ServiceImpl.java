package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9900DTO;
import com.iteyes.mapper.pms.PJTE9900Mapper;
import com.iteyes.service.PJTE9900Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PJTE9900ServiceImpl implements PJTE9900Service {
	@Autowired
	private PJTE9900Mapper pjte9900Mapper;

	@Override
	public List<PJTE9900DTO> select_0000_01(PJTE9900DTO PJTE9900) throws Exception {

		List<PJTE9900DTO> list =  pjte9900Mapper.select_0000_01(PJTE9900);

		return list;
	}

	/*select*/
	@Override
	public List<PJTE9900DTO> select_9900(PJTE9900DTO PJTE9900) throws Exception {
		List<PJTE9900DTO> list = new ArrayList<>();

		if(PJTE9900.getGubun().equals("1")) {
			list = pjte9900Mapper.select_9900_01(PJTE9900);
		}
		/*연관작업조회*/
		if(PJTE9900.getGubun().equals("2")) {
			list = pjte9900Mapper.select_9900_02(PJTE9900);
		}

		return list;
	}

	/* create */
	@Override
	public boolean insert_9900_01(PJTE9900DTO PJTE9900) throws Exception {

		return pjte9900Mapper.insert_9900_01(PJTE9900);
	}

	/* update */
	@Override
	public boolean update_9900_01(PJTE9900DTO PJTE9900) throws Exception {

		return pjte9900Mapper.update_9900_01(PJTE9900);
	}

	/* delete */
	@Override
	public boolean delete_9900_01(PJTE9900DTO PJTE9900) throws Exception {

		return pjte9900Mapper.delete_9900_01(PJTE9900);
	}
}
