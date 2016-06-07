package com.aesireanempire.hello.greeting;

import javax.inject.Inject;
import java.util.Map;

public class Greeter {
    private final Map<String, IGreeter> languages;

    @Inject
    Greeter(Map<String, IGreeter> languages) {
        this.languages = languages;
    }

    public String greet(String name, String language) {
        IGreeter greeterLanguage = languages.get(language);

        if (greeterLanguage == null) {
            greeterLanguage = languages.get("en");
        }

        return greeterLanguage.greet(capitalize(name));
    }

    private String capitalize(String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
