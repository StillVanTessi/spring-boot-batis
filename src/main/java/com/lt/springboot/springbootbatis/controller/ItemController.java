/**
 * @Description
 * @author StillVanTessi
 * @create 2020-07-06     15:00
 * @projectname spring-boot-batis
 * @package com.lt.springboot.springbootbatis.controller
 * @filename null.java
 * @idea IntelliJ IDEA
 */


package com.lt.springboot.springbootbatis.controller;


import com.lt.springboot.springbootbatis.mapper.ItemMapper;
import com.lt.springboot.springbootbatis.pojo.Item;
import com.lt.springboot.springbootbatis.pojo.ItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemMapper itemMapper;

    @RequestMapping("/item/selectCategoryById")
    public List<Item> selectCategoryById(int categoryId){
//        example用来生成where语句
        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.or();
        criteria.andCategoryIdEqualTo(categoryId);
        return itemMapper.selectByExample(example);

    }

    @RequestMapping("/item/selectItemById")
    public Item selectItemByTd(int itemId){
        return itemMapper.selectByPrimaryKey(itemId);
    }
}
