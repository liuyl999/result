package com.liuyl.util;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2017-3-23.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
