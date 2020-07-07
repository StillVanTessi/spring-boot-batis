/**
 * @Description
 * @author StillVanTessi
 * @create 2020-07-06     10:52
 * @projectname spring-boot-batis
 * @package com.lt.springboot.springbootbatis.controller
 * @filename null.java
 * @idea IntelliJ IDEA
 */


package com.lt.springboot.springbootbatis.controller;

import com.lt.springboot.springbootbatis.mapper.CategoryMapper;
import com.lt.springboot.springbootbatis.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/category/getAll")
    public List<Category> getAll(){
        List<Category> re = categoryMapper.selectByExample(null);
        return re;
    }
}
