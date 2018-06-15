package com.entity;

import javax.persistence.*;

@Table(name = "extend_user_key")
public class ExtendUserKey {
    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c_userID")
    private String userid;

    @Column(name = "c_key_count")
    private Integer keyCount;

    @Column(name = "c_order1")
    private Boolean order1;

    @Column(name = "c_order2")
    private Boolean order2;

    @Column(name = "c_order3")
    private Boolean order3;

    @Column(name = "c_order4")
    private Boolean order4;

    /**
     * @return c_id
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
     * @return c_userID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return c_key_count
     */
    public Integer getKeyCount() {
        return keyCount;
    }

    /**
     * @param keyCount
     */
    public void setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
    }

    /**
     * @return c_order1
     */
    public Boolean getOrder1() {
        return order1;
    }

    /**
     * @param order1
     */
    public void setOrder1(Boolean order1) {
        this.order1 = order1;
    }

    /**
     * @return c_order2
     */
    public Boolean getOrder2() {
        return order2;
    }

    /**
     * @param order2
     */
    public void setOrder2(Boolean order2) {
        this.order2 = order2;
    }

    /**
     * @return c_order3
     */
    public Boolean getOrder3() {
        return order3;
    }

    /**
     * @param order3
     */
    public void setOrder3(Boolean order3) {
        this.order3 = order3;
    }

    /**
     * @return c_order4
     */
    public Boolean getOrder4() {
        return order4;
    }

    /**
     * @param order4
     */
    public void setOrder4(Boolean order4) {
        this.order4 = order4;
    }
}