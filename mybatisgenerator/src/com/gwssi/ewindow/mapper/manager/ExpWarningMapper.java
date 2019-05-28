package com.gwssi.ewindow.mapper.manager;

import com.gwssi.ewindow.pojo.manager.ExpWarning;
import com.gwssi.ewindow.pojo.manager.ExpWarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpWarningMapper {
    int countByExample(ExpWarningExample example);

    int deleteByExample(ExpWarningExample example);

    int deleteByPrimaryKey(String warnid);

    int insert(ExpWarning record);

    int insertSelective(ExpWarning record);

    List<ExpWarning> selectByExample(ExpWarningExample example);

    ExpWarning selectByPrimaryKey(String warnid);

    int updateByExampleSelective(@Param("record") ExpWarning record, @Param("example") ExpWarningExample example);

    int updateByExample(@Param("record") ExpWarning record, @Param("example") ExpWarningExample example);

    int updateByPrimaryKeySelective(ExpWarning record);

    int updateByPrimaryKey(ExpWarning record);
}