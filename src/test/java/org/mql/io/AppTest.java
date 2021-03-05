package org.mql.io;

import org.junit.Test;

public class AppTest {

    @Test(expected = Exception.class)
    public void AppArgumentsTest() throws Exception {
        App.main(new String[]{"es"});
    }

}
