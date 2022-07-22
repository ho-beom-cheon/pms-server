package com.iteyes.mapper.pms;

import com.iteyes.dto.pms.PJTE9002DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PJTE9002Mapper {
    List<PJTE9002DTO> select_9002_01(PJTE9002DTO PJTE9002) throws Exception;

    boolean insert_9002_01(PJTE9002DTO PJTE9002) throws Exception;

    boolean delete_9002_01(PJTE9002DTO PJTE9002) throws Exception ;

    boolean update_9002_01(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_02(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_03(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_04(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_05(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_06(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_07(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_08(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_09(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_11(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_12(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_13(PJTE9002DTO PJTE9002) throws Exception;


    List<PJTE9002DTO> select_9002_10(PJTE9002DTO PJTE9002) throws Exception ;
    boolean insert_9002_10(PJTE9002DTO PJTE9002) throws Exception;
    boolean update_9002_10(PJTE9002DTO PJTE9002) throws Exception;

}
