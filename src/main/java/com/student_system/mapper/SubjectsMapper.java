package com.student_system.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.student_system.pojo.Subjects;
import com.student_system.pojo.SubjectsExample;

public interface SubjectsMapper {
    int countByExample(SubjectsExample example);

    int deleteByExample(SubjectsExample example);

    int deleteByPrimaryKey(String subjectsId);

    int insert(Subjects record);

    int insertSelective(Subjects record);

    List<Subjects> selectByExample(SubjectsExample example);

    Subjects selectByPrimaryKey(String subjectsId);

    int updateByExampleSelective(@Param("record") Subjects record, @Param("example") SubjectsExample example);

    int updateByExample(@Param("record") Subjects record, @Param("example") SubjectsExample example);

    int updateByPrimaryKeySelective(Subjects record);

    int updateByPrimaryKey(Subjects record);
}