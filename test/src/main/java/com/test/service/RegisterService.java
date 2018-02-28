package com.test.service;


import com.test.model.Register;
import com.test.model.ResponseJsonData;
import org.springframework.stereotype.Service;

/**
 * Administrator
 * Name:liuc
 * Date:2016/12/21
 * Time:16:11
 */
//注册类
@Service
public interface RegisterService {

    //注册接口
    public ResponseJsonData<Register> addRegister(Register register);

}
