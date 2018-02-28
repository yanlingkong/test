package com.test.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by liuc on 2018/1/8.
 */
//用户实体类
@Data
public class Register {
    private String username;// 用户名
    private String password;// 密码
    private String email;// 电子邮箱
    private String identity;//身份证号
    private String city;//城市
    private String date;//年月日
    private String synopsis;//简介
    private String phone;//手机号
    private String sex;//性别0男1女
    private String age;//年龄
    private String creationTime;//创建时间
    private String updateTime;//更新时间
    private String image;//更新时间
    private MultipartFile url; //图片地址

}
