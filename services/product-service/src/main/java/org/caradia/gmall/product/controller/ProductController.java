package org.caradia.gmall.product.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.caradia.gmall.common.result.Result;
import org.caradia.gmall.product.entities.BaseCategory1;
import org.caradia.gmall.product.entities.BaseCategory2;
import org.caradia.gmall.product.entities.BaseCategory3;
import org.caradia.gmall.product.service.BaseCategory1Service;
import org.caradia.gmall.product.service.BaseCategory2Service;
import org.caradia.gmall.product.service.BaseCategory3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 姽辫
 * @className CatogreyController
 * @date Create in 2022-10-29 21:11
 */
@RestController
@RequestMapping("/admin/product")
@Api(description = "分类与平台属性接口，包含操作：\n" +
        "1.获取一级分类;\n" +
        "2.根据一级分类id获取二级分类;\n" +
        "3.根据二级分类id获取三级分类;\n")
public class ProductController {
    @Autowired
    private BaseCategory1Service category1Service;
    @Autowired
    private BaseCategory2Service category2Service;
    @Autowired
    private BaseCategory3Service category3Service;

    @ApiOperation("1.获取一级分类;")
    @GetMapping("/getCategory1")
    public Result getCategory() {
        List<BaseCategory1> list = this.category1Service.list();
        return Result.ok(list);
    }

    @ApiOperation("2.根据一级分类id获取二级分类;")
    @GetMapping("/getCategory2/{c1id}")
    public Result getCategory2ByC1id(@PathVariable("c1id") Long c1id) {
        QueryWrapper<BaseCategory2> wrapper = new QueryWrapper<>();
        wrapper.eq("category1_id", c1id);
        List<BaseCategory2> list = this.category2Service.list(wrapper);
        return Result.ok(list);
    }

    @ApiOperation("3.根据二级分类id获取三级分类;")
    @GetMapping("/getCategory3/{c2id}")
    public Result getCategory3ByC2id(@PathVariable("c2id") Long c2id) {
        QueryWrapper<BaseCategory3> wrapper = new QueryWrapper<>();
        wrapper.eq("category2_id", c2id);
        List<BaseCategory3> list = this.category3Service.list(wrapper);
        return Result.ok(list);
    }

}
