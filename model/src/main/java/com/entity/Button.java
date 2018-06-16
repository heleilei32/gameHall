package com.entity;

import javax.persistence.*;

@Table(name = "sys_button")
public class Button {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 按钮名称
     */
    @Column(name = "vc_btname")
    private String btname;

    /**
     * 按钮的id
     */
    @Column(name = "vc_btcode")
    private String btcode;

    /**
     * 所属菜单id
     */
    @Column(name = "fk_menu_id")
    private String fkMenuId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取按钮名称
     *
     * @return vc_btname - 按钮名称
     */
    public String getBtname() {
        return btname;
    }

    /**
     * 设置按钮名称
     *
     * @param btname 按钮名称
     */
    public void setBtname(String btname) {
        this.btname = btname;
    }

    /**
     * 获取按钮的id
     *
     * @return vc_btcode - 按钮的id
     */
    public String getBtcode() {
        return btcode;
    }

    /**
     * 设置按钮的id
     *
     * @param btcode 按钮的id
     */
    public void setBtcode(String btcode) {
        this.btcode = btcode;
    }

    /**
     * 获取所属菜单id
     *
     * @return fk_menu_id - 所属菜单id
     */
    public String getFkMenuId() {
        return fkMenuId;
    }

    /**
     * 设置所属菜单id
     *
     * @param fkMenuId 所属菜单id
     */
    public void setFkMenuId(String fkMenuId) {
        this.fkMenuId = fkMenuId;
    }
}