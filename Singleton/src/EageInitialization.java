public class EageInitialization {
    //Create as soon as create an class
    public static final EageInitialization INSTANCE = new EageInitialization();

    private EageInitialization(){

    }
    public static EageInitialization getInstance(){
        return INSTANCE;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
                 Singleton will be applied in cases:
       -Ensure only have an expression (instance) in class.
       -Ability to control the number of expression of class in limited.

                 3 Principles to create a Singleton
    1. Constructor is ability to access with private only inside domestic class
    2. The expression of it must be created as 'private static final variable' to ensure
    variable only declare in class.
    3. Must have a method as 'public static' to return an expression was mention above
    */
}
