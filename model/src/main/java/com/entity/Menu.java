package com.entity;

import javax.persistence.*;

@Table(name = "sys_menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名称
     */
    @Column(name = "vc_menuname")
    private String menuname;

    /**
     * 上级id
     */
    @Column(name = "nb_pid")
    private Integer pid;

    /**
     * 链接地址
     */
    @Column(name = "vc_url")
    private String url;

    /**
     * 图标
     */
    @Column(name = "vc_icon")
    private String icon;

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
     * 获取菜单名称
     *
     * @return vc_menuname - 菜单名称
     */
    public String getMenuname() {
        return menuname;
    }

    /**
     * 设置菜单名称
     *
     * @param menuname 菜单名称
     */
    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    /**
     * 获取上级id
     *
     * @return nb_pid - 上级id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置上级id
     *
     * @param pid 上级id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取链接地址
     *
     * @return vc_url - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图标
     *
     * @return vc_icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}