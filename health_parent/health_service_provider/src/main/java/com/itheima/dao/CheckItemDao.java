package com.itheima.dao;

import com.itheima.domain.CheckItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheckItemDao {

    @Insert("insert into t_checkitem(code,name,sex,age,price,type,attention,remark)" +
            "values(#{code},#{name},#{sex},#{age},#{price},#{type},#{attention},#{remark})")
    void addCheckItem(CheckItem checkItem);

    @Select("select * from t_checkitem")
    List<CheckItem> findAll();
}
