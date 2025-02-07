class RubberDuck extends Duck implements SqueakBehavior, MuteBehavior {
    
    public void squeak() {
        System.out.println("The rubber duck squeaks!");
    }

    
    public void mute() {
        System.out.println("The rubber duck is mute.");
    }
}
