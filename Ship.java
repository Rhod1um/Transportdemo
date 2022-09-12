package transportdemo;

public class Ship {
    private boolean isSailing=true;

    void printIsSailing(){
        System.out.println("Ship is sailing");
    }

    public boolean isSailing(){
        return isSailing;
    }

}
