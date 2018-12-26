package com.suchaos.ssm.mapper;

import com.suchaos.ssm.po.Students;
import com.suchaos.ssm.po.StudentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentsMapper {
    int countByExample(StudentsExample example);

    int deleteByExample(StudentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Students record);

    int insertSelective(Students record);

    List<Students> selectByExample(StudentsExample example);

    Students selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByExample(@Param("record") Students record, @Param("example") StudentsExample example);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}