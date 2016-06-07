package com.aesireanempire.hello;


import com.google.inject.AbstractModule;

public class HelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloResource.class);
    }
}
