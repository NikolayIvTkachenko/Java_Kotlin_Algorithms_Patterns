package org.example.algorithms_task_unit_test.junit4.assumprions;

import java.io.File;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AssumptionsTest {

    @Test
    public void givenFolderWhenGetAbsolutePathThenSuccess() {

        assumeThat(File.separatorChar, is('/'));
        assertThat(new File(".").getAbsolutePath(), is("C:/test/test"));
    }

}
