package com.cassell.nightwatchman;

import com.cassell.nightwatchman.controller.PageController;
import com.cassell.nightwatchman.entity.ChickenMsg;
import com.cassell.nightwatchman.service.ChickenService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NightwatchmanApplicationTests {

    @Test
    void contextLoads() {
        ChickenService chickenService = new ChickenService();
        ChickenMsg msg=chickenService.findMsg(1);
        System.out.println(msg);
    }

}
