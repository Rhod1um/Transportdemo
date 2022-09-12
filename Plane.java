package transportdemo;

public class Plane extends Vehicle{

    Plane(String name){
        super(name);
    }

    void fly(){
        System.out.println("plane is flying");
    }

    void startEngine(){
        System.out.println("Plane engine is started");
        super.startEngine();
        System.out.println(getEngineIsStarted());
    }
}
