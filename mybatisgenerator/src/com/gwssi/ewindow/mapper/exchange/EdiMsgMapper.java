package com.gwssi.ewindow.mapper.exchange;

import com.gwssi.ewindow.pojo.exchange.EdiMsg;
import com.gwssi.ewindow.pojo.exchange.EdiMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdiMsgMapper {
    int countByExample(EdiMsgExample example);

    int deleteByExample(EdiMsgExample example);

    int deleteByPrimaryKey(String msgid);

    int insert(EdiMsg record);

    int insertSelective(EdiMsg record);

    List<EdiMsg> selectByExample(EdiMsgExample example);

    EdiMsg selectByPrimaryKey(String msgid);

    int updateByExampleSelective(@Param("record") EdiMsg record, @Param("example") EdiMsgExample example);

    int updateByExample(@Param("record") EdiMsg record, @Param("example") EdiMsgExample example);

    int updateByPrimaryKeySelective(EdiMsg record);

    int updateByPrimaryKey(EdiMsg record);
}