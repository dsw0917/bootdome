package com.yxt.service.impl;

import com.yxt.dao.DaoSupport;
import com.yxt.entity.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import com.yxt.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/2/20.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private DaoSupport dao;

    @Override
    public List<PageData> list() throws Exception {
        PageData pd = new PageData();
        List<PageData> list = new ArrayList<>();
        list = (List<PageData>) dao.findForList("BookMapper.All", pd);
        return list;
    }
}
