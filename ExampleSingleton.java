puiblic class ExampleSingleton{
    // lazy construction
    // the class variable is null if no isntance is instantiated
    private static ExampleSingleton uniqueInstance = null;

    // private constructor
    private ExampleSingleton() {
        System.out.println("Private Constructor");  
    }

    // lazy construction of the instance
    public static Example getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

}

