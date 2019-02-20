package com.yxt.controller;

import com.yxt.base.BaseController;
import com.yxt.entity.PageData;
import com.yxt.service.BookService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2019/2/20.
 */
@RestController
@RequestMapping("book")
public class BookController extends BaseController {
    @Autowired
    BookService bookService;

    @ApiOperation(value="得到大楼列表", notes="得到列表")
    @ApiImplicitParam(name = "pageListBiuld", value = "大楼列表", required = true, dataType = "PageData")
    @PostMapping(value = "/list")
    @ResponseBody
    public List pageList() throws Exception{
        PageData pd = this.getPageData();
        List<PageData> list = bookService.list();
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        //PageInfo<PageData> pageInfo = new PageInfo<>(builds);
        return list;
    }
}
