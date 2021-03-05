package org.mql.io;

public class Translator {
    private static Translator instance;
    private static Dict dict;


    public static Dict Dict() {
        return dict;
    }

    public String translate(String word, String lang) {
        return dict.getDict().get(lang).get(word);
    }

    static Translator getInstance() {
        if (instance == null) {
            instance = new Translator();
        }
        return instance;
    }
}
