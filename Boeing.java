package transportdemo;

public class Boeing extends Plane{


    Boeing(String name) {
        super(name);
    }

    void startEngine(){
        System.out.println("Boeing engine is started");
        super.startEngine();
        System.out.println(getEngineIsStarted());
    }

}
