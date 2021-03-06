package eu.df.jiffybox;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertNotNull;

/**
 * Test for {@link Build}.
 */
public class BuildTest {

    /**
     * Make sure an exception is thrown when trying to create an instance of the
     * {@link Build} class.
     *
     * @throws Exception Expect an exception.
     */
    @Test(expected = Exception.class)
    public void testPrivateConstructor_AssertionError() throws Exception {
        Constructor<Build> constructor = Build.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }

    /**
     * Test for {@link Build#monitoringCheck(String, String, Integer)}.
     */
    @Test
    public void testMonitoringCheck() {
        assertNotNull(Build.monitoringCheck("", "", 0));
    }

    /**
     * Test for {@link Build#jiffyBox(String, String)}.
     */
    @Test
    public void testJiffyBox() {
        assertNotNull(Build.jiffyBox("", ""));
    }

    /**
     * Test for {@link Build#jiffyBox(String, int)}.
     */
    @Test
    public void testJiffyBox1() {
        assertNotNull(Build.jiffyBox("", 0));
    }

    /**
     * Test for {@link Build#metadata()}.
     */
    @Test
    public void testMetadata() {
        assertNotNull(Build.metadata());
    }
}