package com.newer.ksgl.model;

import com.newer.ksgl.model.testservice.TestUsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelApplicationTests {

    private TestUsersService testUsersService = new TestUsersService();

    @Test
    public void contextLoads() {
        testUsersService.test_findAll();
    }

}
