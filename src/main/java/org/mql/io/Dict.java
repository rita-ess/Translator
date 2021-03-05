package org.mql.io;

import java.util.HashMap;
import java.util.Map;

public class Dict {
    private Map<String, Map<String, String>> dict;

    public Dict() {
        init();
    }


    private void init() {
        dict = new HashMap<>();
        Map<String, String> frenchMap = new HashMap<>();
        frenchMap.put("morning", "matin");
        frenchMap.put("afternoon", "valeur_incorrecte");
        frenchMap.put("night", "nuit");
        dict.put("fr", frenchMap);

        Map<String, String> spanishMap = new HashMap<>();
        spanishMap.put("morning", "mañana");
        spanishMap.put("afternoon", "tarde");
        spanishMap.put("night", "noche");
        dict.put("es", spanishMap);
    }

    public Map<String, Map<String, String>> getDict() {
        return dict;
    }
}
