package newton.Abstraction;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Vehicle is starting");
    }
    public void stop() {
        System.out.println("Vehicle is stoping");
    }
    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}
