package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.constant.MessageConstant;
import com.itheima.domain.CheckItem;
import com.itheima.entity.Result;
import com.itheima.service.CheckItemService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/checkItem")
public class CheckItemController {

    @Reference
    private CheckItemService checkitemService;
    @RequestMapping("/addCheckItem")
    public Result addCheckItem(@RequestBody CheckItem checkItem){
        try {
            checkitemService.addCheckItem(checkItem);
            return new Result(true, MessageConstant.ADD_CHECKITEM_SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,MessageConstant.ADD_CHECKITEM_FAIL);
        }
    }

    @RequestMapping("/findAll")
    public Result findAll(){
        List<CheckItem> list = checkitemService.findAll();
        Result result = new Result(true,"查询成功",list);
        return result;
    }
}
