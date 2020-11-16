package com.songqingchao.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-11-16 16:25:22
 */
public class User implements Serializable {
    private static final long serialVersionUID = 430818329409864018L;

    private String xingming;

    private String nianling;

    private String zhiye;

    private String xingbie;

    private Integer id;

    private String password;


    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getNianling() {
        return nianling;
    }

    public void setNianling(String nianling) {
        this.nianling = nianling;
    }

    public String getZhiye() {
        return zhiye;
    }

    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}