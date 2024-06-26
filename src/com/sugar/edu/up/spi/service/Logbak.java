package com.sugar.edu.up.spi.service;

import com.sugar.edu.up.spi.Logger;

/**
 * @Description todo
 * @Author sugar
 * @Date 2024/6/26 11:41 PM
 * @Version 1.0
 */
public class Logbak implements Logger {
    @Override
    public void info(String s) {
        System.out.println("logback info 打印日志："+ s);
    }

    @Override
    public void debug(String s) {
        System.out.println("logback debug 打印日志："+ s);

    }
}
