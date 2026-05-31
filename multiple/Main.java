void main(String[] args) {
    final Languages language = Languages.valueOf(args[0]);
    final Greeting greeting = new Greeting(args[1]);

    BusinessLogic bl = new BusinessLogic();

    IO.println(bl.greetingString(language, greeting));
}
