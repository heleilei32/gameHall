package com.model;

/**
 * 服务器分页参数
 */
public class DTParams {
    private Integer draw;
    private Integer start;//开始条数
    private Integer length;//每页条数

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
