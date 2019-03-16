package com.suchaos.ssm.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Test1
 *
 * @author suchao
 * @date 2019/3/10
 */
@Component
public class Test1 implements InitializingBean, DisposableBean {
    public Test1() {
        System.out.println("Test constructor");
    }

    public void init() {
        System.out.println("init method");
    }

    public void destory() {
        System.out.println("destory method");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destory");
    }

    public void go() {
        System.out.println("go");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destory()");
    }
}
