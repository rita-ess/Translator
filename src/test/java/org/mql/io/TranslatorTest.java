package org.mql.io;

import org.junit.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TranslatorTest {

    private String word;
    private String lang;
    private String expectedResult;

    public TranslatorTest(String word, String lang, String expectedResult) {
        this.word = word;
        this.lang = lang;
        this.expectedResult = expectedResult;
    }

    @BeforeEach
    void init() {
        System.out.println(this.word + ' ' + this.lang);
    }

    @Test
    void TestTranslation() {
        String result = Translator.getInstance().translate(word, lang);
        assertEquals(expectedResult, result);
    }
}
