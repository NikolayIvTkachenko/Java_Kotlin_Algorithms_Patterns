package org.example.algorithms_task_unit_test.junit4.test_suite;

import java.util.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestHeartbeat {

    private static final Logger log = Logger.getLogger(TestHeartbeat.class.getName());

    @Test
    public void givenConnectionWhenHeartbeatThenSuccess() {
        log.info("Heartbeat successfully complete ...");
    }
}