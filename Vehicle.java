package transportdemo;

public class Vehicle {
  private boolean engineIsStarted = false;
  private String name;

  Vehicle(String name){ //laver man konstruktør i overklassen får man related problems fordi java nu ikke
    //laver defautl konstrktøre i subklasserne
    this.name=name;
  }

  void startEngine() {
    engineIsStarted = true;
    System.out.println("Engine started.");
  }

  boolean getEngineIsStarted() {
    return engineIsStarted;
  }

  public String getName() {
    return name;
  }
}
