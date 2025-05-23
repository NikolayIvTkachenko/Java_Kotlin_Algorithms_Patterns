package org.example.algorithms_task_unit_test.junit4.test_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestConnect.class,
        TestHeartbeat.class,
        TestDisconnect.class
})
public class TestSuite {
    // this class was intentionally left empty
}
