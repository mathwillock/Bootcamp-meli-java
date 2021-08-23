package com.company.collections;

import java.util.ArrayList;
import java.util.List;

public class Aula1 {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JS");
        languages.add("Go");

        System.out.println(languages.get(2));
        System.out.println(languages.indexOf("Python"));
        System.out.println(languages.size());

        for(String language: languages) {
            System.out.println(language);
        }

        languages.remove(2);
        System.out.println(languages);

        languages.remove("Python");

        for(String language: languages) {
            System.out.println(language);
        }



    }
}
