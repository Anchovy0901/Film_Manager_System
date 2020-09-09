package entity;

import java.time.LocalDateTime;

/**
 * 用户实体
 */
public class User {

    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 密码
     */
    private String password;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;
}
