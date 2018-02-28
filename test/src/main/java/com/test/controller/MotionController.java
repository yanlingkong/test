package com.test.controller;

import com.test.model.Register;
import com.test.model.ResponseJsonData;
import com.test.model.ResultCode;
import com.test.service.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Pattern;

/**
 * Created by liuc on 2018/1/8.
 */
@RestController
@RequestMapping("/motion")
@Slf4j
@Api(description = "测试")
public class MotionController {
    @Autowired//注册类
    private RegisterService registerService;
    @ApiOperation(value = "注册接口",
            notes = "注册接口",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = false, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "第一次密码", required = false, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "password2", value = "第二次密码", required = false, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "email", value = "邮箱", required = false, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "sex", value = "性别", required = false, paramType = "form", dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = false, paramType = "form", dataType = "String")

       })
    @PostMapping(value = "/register.json")
    public ResponseJsonData<Register> resetPasswordAppUser(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) String password2,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String sex,
            @RequestParam(required = false) String age
    ){
            log.info("START");
            //设置返回code
            ResponseJsonData<Register> resultModel = new ResponseJsonData<Register>();
            Register register = new Register();//注册实体类
            register.setUsername(username); //用户名
            register.setPassword(password); //用户密码
            register.setEmail(email); //用户邮箱
            register.setSex(sex);//性别
            register.setAge(age); //年龄
        try{
            log.info("用户名："+username+"用户密码："+password+"用户邮箱："+email+"性别："+sex+"年龄："+age);
            if(username == null ) {// 判断用户名是否为空
                resultModel.setMsg("用户名不能为空");
                return resultModel;
            }else if (!Pattern.matches("^[a-zA-Z]\\w{3,10}", username)) {
                resultModel.setMsg("请输入合法的用户名！");
                return resultModel;
            }else if (password == null ) {// 判断密码是否为空
                resultModel.setMsg("密码不能为空");
                return resultModel;
            }else if (!Pattern.matches("^[a-zA-Z0-9]{6,16}$", password)) {
                resultModel.setMsg("请输入合法的密码！");
                return resultModel;
            }else  if (password2 == null){
                resultModel.setMsg("请再输一遍密码");
                return resultModel;
            }else if (!(password).equals(password2)) {// 校验两次输入的密码是否相同
                resultModel.setMsg("两次输入的密码不同！");
                return resultModel;
            }else if (email == null ) {// 判断邮箱是否为空
                resultModel.setMsg("邮箱不能为空");
                return resultModel;
            }else if (!email.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$")){
                resultModel.setMsg("请输入合法的电子邮箱！");
                return resultModel;
            }
            //掉注册方法
            resultModel = registerService.addRegister(register);
            log.info("END");
            return resultModel;
        }catch (Exception e) {
            resultModel.setCode( ResultCode.UNKNOWN);
            e.printStackTrace();
            return resultModel;
        }
    }
}
