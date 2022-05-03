package com.iteyes.service.impl.pms;

import com.iteyes.dto.pms.PJTE9000DTO;
import com.iteyes.mapper.pms.PJTE9000Mapper;
import com.iteyes.service.PJTE9000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PJTE9000ServiceImpl implements PJTE9000Service {
    @Autowired
    private PJTE9000Mapper pjte9000Mapper;

    @Override
    public List<PJTE9000DTO> select_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_01(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_02(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_03(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_03(PJTE9000);

    }

    @Override
    public boolean insert_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_01(PJTE9000);

    }

    @Override
    public boolean update_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.update_9000_01(PJTE9000);

    }

    @Override
    public boolean delete_9000_41(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_41(PJTE9000);

    }

    @Override
    public boolean insert_9000_03(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_03(PJTE9000);

    }

    @Override
    public boolean update_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.update_9000_02(PJTE9000);

    }

    @Override
    public boolean delete_9000_42(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_42(PJTE9000);

    }

    @Override
    public boolean delete_9000_01(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_01(PJTE9000);

    }

    @Override
    public boolean insert_9000_02(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_02(PJTE9000);

    }

    @Override
    public boolean delete_9000_90(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_90(PJTE9000);

    }

    @Override
    public boolean delete_9000_91(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_91(PJTE9000);

    }

    @Override
    public boolean delete_9000_92(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_92(PJTE9000);

    }

    @Override
    public boolean delete_9000_93(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_93(PJTE9000);

    }

    @Override
    public boolean delete_9000_94(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_94(PJTE9000);

    }

    @Override
    public boolean insert_9000_90(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_90(PJTE9000);

    }

    @Override
    public boolean insert_9000_91(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_91(PJTE9000);

    }

    @Override
    public boolean insert_9000_92(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_92(PJTE9000);

    }

    @Override
    public boolean insert_9000_93(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_93(PJTE9000);

    }

    @Override
    public boolean insert_9000_94(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_94(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_50(PJTE9000);

    }

    @Override
    public boolean delete_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_50(PJTE9000);

    }

    @Override
    public boolean update_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.update_9000_50(PJTE9000);

    }

    @Override
    public boolean insert_9000_50(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_50(PJTE9000);

    }

    @Override
    public boolean delete_9000_51(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_51(PJTE9000);

    }

    @Override
    public boolean insert_9000_51(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_51(PJTE9000);

    }

    @Override
    public List<PJTE9000DTO> select_9000_10(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.select_9000_10(PJTE9000);

    }

    @Override
    public boolean delete_9000_10(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_10(PJTE9000);

    }

    @Override
    public boolean insert_9000_10(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_10(PJTE9000);

    }

    @Override
    public boolean delete_9000_20(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_20(PJTE9000);

    }

    @Override
    public boolean delete_9000_22(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_22(PJTE9000);

    }

    @Override
    public boolean delete_9000_23(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_23(PJTE9000);

    }

    @Override
    public boolean delete_9000_24(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_24(PJTE9000);

    }

    @Override
    public boolean delete_9000_25(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_25(PJTE9000);

    }

    @Override
    public boolean delete_9000_26(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_26(PJTE9000);

    }

    @Override
    public boolean delete_9000_27(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_27(PJTE9000);

    }

    @Override
    public boolean delete_9000_28(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_28(PJTE9000);

    }

    @Override
    public boolean delete_9000_31(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_31(PJTE9000);

    }

    @Override
    public boolean delete_9000_32(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_32(PJTE9000);

    }

    @Override
    public boolean delete_9000_33(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_33(PJTE9000);

    }

    @Override
    public boolean delete_9000_35(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_35(PJTE9000);

    }

    @Override
    public boolean delete_9000_36(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_36(PJTE9000);

    }

    @Override
    public boolean delete_9000_60(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_60(PJTE9000);

    }

    @Override
    public boolean delete_9000_61(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_61(PJTE9000);

    }

    @Override
    public boolean delete_9000_62(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_62(PJTE9000);

    }

    @Override
    public boolean delete_9000_63(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_63(PJTE9000);

    }

    @Override
    public boolean delete_9000_64(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_64(PJTE9000);

    }

    @Override
    public boolean delete_9000_65(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_65(PJTE9000);

    }

    @Override
    public boolean delete_9000_66(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_66(PJTE9000);

    }

    @Override
    public boolean delete_9000_67(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_67(PJTE9000);

    }

    @Override
    public boolean delete_9000_68(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_68(PJTE9000);

    }

    @Override
    public boolean delete_9000_69(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_69(PJTE9000);

    }

    @Override
    public boolean delete_9000_70(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_70(PJTE9000);

    }

    @Override
    public boolean delete_9000_71(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.delete_9000_71(PJTE9000);

    }

    @Override
    public boolean insert_9000_20(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_20(PJTE9000);

    }

    @Override
    public boolean insert_9000_22(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_22(PJTE9000);

    }

    @Override
    public boolean insert_9000_23(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_23(PJTE9000);

    }

    @Override
    public boolean insert_9000_24(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_24(PJTE9000);

    }

    @Override
    public boolean insert_9000_25(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_25(PJTE9000);

    }

    @Override
    public boolean insert_9000_26(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_26(PJTE9000);

    }

    @Override
    public boolean insert_9000_27(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_27(PJTE9000);

    }

    @Override
    public boolean insert_9000_28(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_28(PJTE9000);

    }

    @Override
    public boolean insert_9000_31(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_31(PJTE9000);

    }

    @Override
    public boolean insert_9000_32(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_32(PJTE9000);

    }

    @Override
    public boolean insert_9000_33(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_33(PJTE9000);

    }

    @Override
    public boolean insert_9000_35(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_35(PJTE9000);

    }

    @Override
    public boolean insert_9000_36(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_36(PJTE9000);

    }

    @Override
    public boolean insert_9000_60(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_60(PJTE9000);

    }

    @Override
    public boolean insert_9000_61(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_61(PJTE9000);

    }

    @Override
    public boolean insert_9000_62(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_62(PJTE9000);

    }

    @Override
    public boolean insert_9000_63(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_63(PJTE9000);

    }

    @Override
    public boolean insert_9000_64(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_64(PJTE9000);

    }

    @Override
    public boolean insert_9000_65(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_65(PJTE9000);

    }

    @Override
    public boolean insert_9000_66(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_66(PJTE9000);

    }

    @Override
    public boolean insert_9000_67(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_67(PJTE9000);

    }

    @Override
    public boolean insert_9000_68(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_68(PJTE9000);

    }

    @Override
    public boolean insert_9000_69(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_69(PJTE9000);

    }

    @Override
    public boolean insert_9000_70(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_70(PJTE9000);

    }

    @Override
    public boolean insert_9000_71(PJTE9000DTO PJTE9000) throws Exception {

        return pjte9000Mapper.insert_9000_71(PJTE9000);

    }
}
