class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {
    
    public void fly() {
        System.out.println("The redhead duck is flying.");
    }

   
    public void quack() {
        System.out.println("The redhead duck is quacking.");
    }
}
