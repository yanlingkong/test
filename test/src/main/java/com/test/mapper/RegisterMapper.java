package com.test.mapper;

import com.test.model.Register;

import java.util.List;
import java.util.Map;

/**
 * Created by liuc on 2018/1/8.
 */
//用户注册mapper
public interface RegisterMapper {

    //查询用户名
    public List<Register> selectRegisterUserName(Map<String, Object> map);

    //注册添加用户信息

    public int addRegisterUser(Register register);


}
