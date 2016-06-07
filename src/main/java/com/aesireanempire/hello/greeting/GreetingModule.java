package com.aesireanempire.hello.greeting;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class GreetingModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, IGreeter> languageMapBinder = MapBinder.newMapBinder(binder(), String.class, IGreeter.class);

        languageMapBinder.addBinding("en").to(EnglishGreeter.class);
        languageMapBinder.addBinding("es").to(SpanishGreeter.class);
    }
}
