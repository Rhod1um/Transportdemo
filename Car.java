package transportdemo;

public class Car extends Vehicle {

  Car(String name){
    super(name);
  }

  void drive() {
    System.out.println("Car driving.");
  }

  void startEngine() {
    System.out.println("Car engine started.");
    super.startEngine();
    System.out.println(getEngineIsStarted());
  }
}
