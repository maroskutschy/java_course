package com.ness;

import java.util.HashMap;

public class MapProgram {

    public static void main(String[] args) {

        java.util.Map<String, String> languages = new HashMap<>();
        System.out.println(languages.put("Java", "language 1"));
        System.out.println(languages.put("Java", "language 100"));
        languages.put("Python", "language 2");
        languages.put("Javascript", "languages 3");

      //  System.out.println(languages.get("Java"));
        languages.put("Java", "language A");
      //  System.out.println(languages.get("Java"));

        // what is keySet ?

        languages.remove("Javascript");
        if (languages.remove("Python", "language B")) {
        //if (languages.remove("Python", "language 2")) {
            System.out.println("Python removed");
        } else {
            System.out.println("Python not removed, pair not found");
        }

        System.out.println(languages.replace("Java", "test"));

        if (languages.replace("Java", "test", "test2")) {
            System.out.println("Java replaced");
        } else {
            System.out.println("Java not replaced");
        }

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }

}
