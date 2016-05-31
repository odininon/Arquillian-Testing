package org.arquillian.example.greeting;

import org.arquillian.example.PhraseBuilder;

import javax.inject.Inject;

public class Greeter {

    private final PhraseBuilder phraseBuilder;

    @Inject
    public Greeter(PhraseBuilder phraseBuilder) {
        this.phraseBuilder = phraseBuilder;
    }

    public String createGreeting(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Can not greet null name");
        }

        return phraseBuilder.buildPhrase("hello", name);
    }
}