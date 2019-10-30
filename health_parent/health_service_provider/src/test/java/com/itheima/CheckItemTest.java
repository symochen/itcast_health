package com.itheima;

import com.itheima.dao.CheckItemDao;
import com.itheima.domain.CheckItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class CheckItemTest {

    @Autowired
    private CheckItemDao checkItemDao;

    @Test
    public void test1(){
        List<CheckItem> all = checkItemDao.findAll();
        System.out.println(all);
    }
}
