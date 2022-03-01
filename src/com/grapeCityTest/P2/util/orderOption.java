package com.grapeCityTest.P2.util;

/**
 * 排序操作类
 */
public class orderOption {
    /**
     * 排序的字段名 Name 或者 Value
     */
    private String name;

    /**
     * 排序的顺序 ASC 或者 DESC
     */
    private String order;

    public orderOption(String name,String order){
        if(!"Name".equals(name)&&!"Value".equals(name)){
            throw new IllegalArgumentException("排序字段错误");
        }
        if(!"ASC".equals(order)&&!"DESC".equals(order)){
            throw new IllegalArgumentException("排序顺序错误");
        }
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "orderOption{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
