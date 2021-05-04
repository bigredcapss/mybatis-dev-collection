package com.gupaoedu.mybatis.v1.mapper;

/**
 * @Author: qingshan
 */
public class Test {
    public static void main(String[] args) {
        String input = "%d %s %d";
        Object[] objs = new Object[]{1,"2",3};
        String result = String.format(input,objs);
        System.out.println(result);
    }
}
