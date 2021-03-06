package com.muke.gulimall.auth.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 木可
 * @version 1.0
 * @date 2021/3/18 15:36
 */
@Data
public class LoginVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String loginAccount;

    private String password;
}
