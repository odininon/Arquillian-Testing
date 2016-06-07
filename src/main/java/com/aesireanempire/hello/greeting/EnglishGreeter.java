package com.aesireanempire.hello.greeting;

class EnglishGreeter implements IGreeter {
    @Override
    public String greet(String name) {
        return String.format("Hello, %s!", name);
    }
}
