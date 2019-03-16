package com.suchaos.ssm.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TestLifeCycle
 *
 * @author suchao
 * @date 2019/3/10
 */
//@Configuration
public class TestLifeCycle {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Test1 test1() {
        return new Test1();
    }

}
