package test.IDao;

import test.domain.Stores;

public interface StoresMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Stores record);

    int insertSelective(Stores record);

    Stores selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Stores record);

    int updateByPrimaryKey(Stores record);
}