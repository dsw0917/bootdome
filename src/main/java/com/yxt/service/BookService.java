package com.yxt.service;

import com.yxt.entity.PageData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/2/20.
 */
public interface BookService {
    List<PageData> list()  throws Exception;
}
