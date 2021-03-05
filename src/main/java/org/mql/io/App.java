package org.mql.io;

public class App {

    public static void main(String[] args) throws Exception {
        String lang = Translator.Dict().getDict().get(args[1]).values().toString().toLowerCase();
        if (args.length != 2 && (lang.equals("fr")) || lang.equals("es")) {
            System.out.println(Translator.getInstance().translate(args[0], args[1]));
        } else {
            throw new Exception("The number of arguments is not valid or lang is not found!");
        }
    }
}

