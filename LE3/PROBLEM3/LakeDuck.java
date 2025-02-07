class LakeDuck extends Duck implements FlyBehavior, QuackBehavior {
    
    public void fly() {
        System.out.println("The lake duck is flying.");
    }

    
    public void quack() {
        System.out.println("The lake duck is quacking.");
    }
}
