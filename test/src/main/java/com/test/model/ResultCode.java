package com.test.model;

/**
 * Created by liuc on 2018/1/8.
 */
public class ResultCode {
    /**
     * 操作成功_CODE
     */
    public static String SUCCESS = "000000";

    /**
     * 用户信息已存在
     */
    public static String EXISTENCE = "101010";
    /**
     * 用户名或密码错误
     */
    public static String USERPASSWPRD = "201010";
    /**
     * 必填信息为空_CODE
     */
    public static String MUSTISNULL = "000001";
    public static String MUSTISNULL_MSG = "必填项目为空";
    /**
     * 信息长度超过限制_CODE
     */
    public static String TOOLONG = "000002";
    /**
     * 数据库服务器错误_CODE
     */
    public static String BARCONTENTWRONG = "000003";
    /**
     * 更新失败
     */
    public static String NOTPASS = "000004";
    /**
     * 网络超时_CODE
     */
    public static String OUTOFTIME = "000005";
    /**
     * 应用服务器错误_CODE
     */
    public static String SERVERERROR = "000006";

    // 权限相关

    /**
     * 无生成权限_CODE
     */
    public static String NOCREATERULES = "010001";
    /**
     * 无查询权限_CODE
     */
    public static String NOQUERYRULES = "010002";
    /**
     * 删除的内容不存在_CODE
     *
     */
    public static String DELCONTENTNULL = "010003";
    /**
     *	插入失败_CODE
     */
    public static String NODELRULES = "010004";
    /**
     *	查询失败或查无结果_CODE
     */
    public static String NOQUERYRESULT = "010005";
    /**
     *	IMSI为通用码_CODE
     */
    public static String NOIMSI = "010006";
    /**
     *	IMEI为通用码_CODE
     */
    public static String NOIMEI = "010007";
    /**
     *	IP转城市失败_CODE
     */
    public static String IPWRONG = "010008";
    /**
     * 	扫描异常_CODE
     */
    public static String SCANWRONG = "020001";
    /**
     * 格式错误_CODE
     */
    public static String CONTENTERROR = "020002";
    /**
     * 手机电量异常_CODE
     */
    public static String PHONOTOBATTERY = "020003";
    /**
     * 号码未识别到区号_CODE
     */
    public static String PHONOTONOAREACODE = "020004";

    // 签名相关

    /**
     * 第三方客户端签名验证失败_CODE
     */
    public static String PARTYSIGNBARWRONG = "030001";
    /**
     * 第三方客户端签名验证失败_MESSAGE
     */
    public static String PARTYSIGNBARWRONG_MSG = "签名验证失败";
    /**
     * 数据格式解析失败_CODE
     */
    public static String DECODEBARWRONG = "030002";
    /**
     * 验签、解密失败_CODE
     */
    public static String SIGNBARWRONG = "030003";

    // 数据库相关
    /**
     * SQL文拼接错误_CODE
     */
    public static String SQL_EXECUTE = "040001";
    /**
     * SQL文拼接错误_MESSAGE
     */
    public static String SQL_EXECUTE_MSG = "SQL文拼接错误";

    /**
     * SQL文查询错误_CODE
     */
    public static String SQL_SEARCH = "040002";
    /**
     * SQL文查询错误_MESSAGE
     */
    public static String SQL_SEARCH_MSG = "SQL文查询错误";

    /**
     * SQL文更新错误_CODE
     */
    public static String SQL_UPDATE = "040003";
    /**
     * SQL文更新错误_MESSAGE
     */
    public static String SQL_UPDATE_MSG = "SQL文更新错误";

    /**
     * SQL文插入错误_CODE
     */
    public static String SQL_INSERT = "040004";
    /**
     * SQL文插入错误_MESSAGE
     */
    public static String SQL_INSERT_MSG = "SQL文插入错误";
    /**
     * SQL文查询错误（查询结果为空）_CODE
     */
    public static String SQL_SEARCH_NULL = "040005";

    // 文件相关

    /**
     * 配置文件不存在_CODE
     */
    public static String CONFIGWRONG = "050001";

    // 订单相关
    /**
     * 已完成订单（支付成功，出票成功） _CODE
     */
    public static String ORDER_OK = "600000";

    /**
     * 交易失败订单 _CODE
     */
    public static String ORDER_ERROR = "600001";

    /**
     * 已支付订单，请勿重复提交订单_CODE
     */
    public static String ORDER_REPEAT = "600002";
    /**
     * 已支付订单，请勿重复提交订单_MESSAGE
     */
    public static String ORDER_REPEAT_MSG = "已支付订单，请勿重复提交订单.";

    /**
     * 无法对取消订单发起支付_CODE
     */
    public static String ORDER_CANCELL = "600003";
    /**
     * 无法对取消订单发起支付_MESSAGE
     */
    public static String ORDER_CANCELL_MSG = "无法对取消订单发起支付.";

    /**
     * 无法对超时订单发起支付_CODE
     */
    public static String ORDER_OVERTIME = "600004";
    /**
     * 无法对超时订单发起支付_MESSAGE
     */
    public static String ORDER_OVERTIME_MSG = "无法对超时订单发起支付.";

    /**
     * 无法对退款成功订单发起支付_CODE
     */
    public static String ORDER_REFUND = "600005";
    /**
     * 无法对退款成功订单发起支付_MESSAGE
     */
    public static String ORDER_REFUND_MSG = "无法对退款成功订单发起支付.";

    /**
     * 支付成功，未出票_CODE
     */
    public static String ORDER_PAY = "600008";
    /**
     * 支付成功，未出票_MESSAGE
     */
    public static String ORDER_PAY_MSG = "支付成功，未出票.";

    /**
     * 支付成功，出票处理中_CODE
     */
    public static String ORDER_PROCESSING = "600009";
    /**
     * 支付成功，出票处理中_MESSAGE
     */
    public static String ORDER_PROCESSING_MSG = "支付成功，出票处理中.";

    /**
     * 订单为空_CODE
     */
    public static String ORDER_NONE = "600010";
    /**
     * 订单为空_MESSAGE
     */
    public static String ORDER_NONE_MSG = "订单ID为空，请查看.";

    /**
     * 提交订单失败_CODE
     */
    public static String ORDER_MAKEERROR = "600011";
    /**
     * 提交订单失败_MESSAGE
     */
    public static String ORDER_MAKEERROR_MSG = "提交订单失败.";

    /**
     * 取消订单失败_CODE
     */
    public static String ORDER_CANCLEERROR = "600012";
    /**
     * 取消订单失败_MESSAGE
     */
    public static String ORDER_CANCLEERROR_MSG = "取消订单失败.";

    // URL地址
    /**
     * URL地址获取成功_CODE
     */
    public static String URL_SUCCESS = "700000";
    /**
     * URL地址获取成功_MESSAGE
     */
    public static String URL_SUCCESS_MSG = "URL地址获取成功.";

    /**
     * URL地址获取失败_CODE
     */
    public static String URL_ERROR = "700001";
    /**
     * URL地址获取失败_MESSAGE
     */
    public static String URL_ERROR_MSG = "URL地址获取失败.";

    // 其他
    /**
     * 未知错误_CODE
     */
    public static String UNKNOWN = "999999";

	/*
	 * 业务错误代码 （非0开头 不同项目第一位开头数字不同，以示区分）
	 */
    /**
     * URL获取失败_MESSAGE
     */
    public static String MSG_TRAIN_001 = "URL获取失败";
    /**
     * catch失败msg
     */
    public static String MSG_CATCH ="不好意思，服务器好像开小差了，亲，请稍后再试一下~";

}
