package com.suchaos.ssm;

import com.suchaos.ssm.bean.Test1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmApplicationTests {

    @Autowired
    private Test1 test1;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLifeCycle() {
        test1.go();
    }

}

