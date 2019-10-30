package com.itheima.service;

import com.itheima.domain.CheckItem;

import java.util.List;

public interface CheckItemService {

    void addCheckItem(CheckItem checkItem);
    List<CheckItem> findAll();
}
