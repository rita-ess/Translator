package org.mql.io;
import org.junit.Test;
import java.util.Map;

import static org.junit.Assert.*;

public class DictTest {
    Dict dict = Translator.Dict();

    @Test
    public void isValidDictionary() {
        assertNotNull(dict.getDict());
    }

    @Test
    public void numberOfEntries() {
        assertEquals(9, dict.getDict().entrySet().size());
    }

    @Test
    public void containsUpperCase() {
        for (Map.Entry<String, Map<String, String>> entry : dict.getDict().entrySet()) {
            for (Map.Entry<String, String> word : entry.getValue().entrySet()) {
                assertTrue(isUpperCase(word.getValue()));
            }
        }
    }

    private boolean isUpperCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
