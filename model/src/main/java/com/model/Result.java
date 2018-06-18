package com.model;

import java.util.List;

/*服务器分页返回结果*/
public class Result {

    private Integer draw;//传什么就返回什么
    private Integer recordsTotal;//没有过滤的记录数 数据库里总共记录数
    private Integer recordsFiltered;//过滤后的记录数
    private List data;//数据
    private String error;//错误提示

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
