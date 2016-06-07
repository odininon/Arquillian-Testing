package com.aesireanempire.hello.greeting;

class SpanishGreeter implements IGreeter {
    @Override
    public String greet(String name) {
        return String.format("Hola, %s!", name);
    }
}
