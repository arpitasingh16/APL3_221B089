public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.swim();
        ((RubberDuck) rubberDuck).squeak();
        ((RubberDuck) rubberDuck).mute();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.swim();
        ((WoodenDuck) woodenDuck).mute();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        ((RedHeadDuck) redHeadDuck).fly();
        ((RedHeadDuck) redHeadDuck).quack();

        Duck lakeDuck = new LakeDuck();
        lakeDuck.swim();
        ((LakeDuck) lakeDuck).fly();
        ((LakeDuck) lakeDuck).quack();
    }
}
