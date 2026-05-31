class BusinessLogic {

    String greetingString(Languages language, Greeting greeting) {
        return switch(language) {
            case NL -> "Hallo %s".formatted(greeting.name());
            case EN -> "Hello %s".formatted(greeting.name());
            case PL -> "Cześć %s".formatted(greeting.name());
        };
    }
}
