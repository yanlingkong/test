package com.test.service.Impl;


import com.test.mapper.RegisterMapper;
import com.test.model.Register;
import com.test.model.ResponseJsonData;
import com.test.model.ResultCode;
import com.test.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuc on 2018/1/8.
 */
@Service
@Slf4j//注册方法实现类
public class RegisterServiceImpl implements RegisterService {

    @Autowired//注册mapper类
    private RegisterMapper registerMapper;

    @Override //注册类
    public ResponseJsonData<Register> addRegister(Register register) {

        //设置返回code
        ResponseJsonData<Register> resultModel = new ResponseJsonData<Register>();

        String username = register.getUsername(); //用户名
        String password = register.getPassword();  //用户密码
        String email = register.getEmail(); //用户邮箱
        String sex = register.getSex(); //性别
        String age = register.getAge(); //年龄

        log.info("用户名："+username+"用户密码："+password+"用户邮箱："+email+"性别："+sex+"年龄："+age);

        int inNum = 0;// 成功插入
        try {
            Map<String, Object> map = new HashMap<String, Object>();//new一个map
            map.put("username",username);
            //查询用户信息
            List<Register> Userlist = registerMapper.selectRegisterUserName(map);
            log.info("用户数据："+Userlist);
            if(Userlist.size() == 0){
                inNum = registerMapper.addRegisterUser(register);
                if(inNum !=0){
                    resultModel.setCode( ResultCode.SUCCESS);
                    resultModel.setMsg("用户注册成功");
                    return resultModel;
                }else {
                    resultModel.setCode(ResultCode.NODELRULES);
                    resultModel.setMsg("用户注册失败");
                    return resultModel;
                }
            }else if(Userlist.size() >= 1){
                resultModel.setCode(ResultCode.EXISTENCE);
                resultModel.setMsg("用户已存在");
                return resultModel;
            }
        } catch (Exception e){
            log.info("返回的结果:ERROR="+e.getMessage());
            resultModel.setCode(ResultCode.NOCREATERULES);
            resultModel.setMsg("警告！非法操作不予处理");
            return resultModel;
        }
        return resultModel;
    }
}
