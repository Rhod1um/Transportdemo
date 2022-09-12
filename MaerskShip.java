package transportdemo;

public class MaerskShip extends Ship {

    void startEngine(){
        System.out.println("Maersk engine started");
        super.printIsSailing();
        System.out.println(super.isSailing());
    }

}
