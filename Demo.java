package transportdemo;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Demo {

  void go() {
    Vehicle v1 = new Vehicle("v1");
    v1.startEngine();

    Car c1 = new Car("c1");
    c1.startEngine();
    c1.drive();

    Plane p1 = new Plane("p1");
    p1.startEngine();

    Boeing b1 = new Boeing("b1");
    b1.startEngine();

    MaerskShip m1 = new MaerskShip();
    m1.startEngine();

    Vehicle v2 = new Car("v2"); //vehicle reference med en bil i? Nej new afgør det, det er en car
    //Car c2 = new Vehicle(); kan ikke, vehicle er ikke car. Men car er vehicle^

    //v2.drive(); //kan se vehicle metoder og attributter men ikke car. Den ser den som en vehicle

    //Typecasting
    ((Car)v2).drive(); //der skal være de yderste paranteser fordi det skal være et samplet objekt, ellers
    //kan den ikke se Car's egne metoder
    //det her kan bruges til hvis man vil lave et array af forskellige transportmidler. Da de skal være
    //samme datatype ville man ikke kunne bruge både Car og Plane
    //man kan kun typecaste ting der er i arvehierarki. Ikke klasser der ikke arver fra hinanden

    Vehicle p2 = new Plane("p2"); //ændre Plane til Car og den udskriver is driving frem for is flying
    if (p2 instanceof Car) //tjekker om p2 er en bil, ellers kan den ikke typecastes
      ((Car)p2).drive(); //kan ikke kalde drive på et fly. Det er dynamisk polymorfisme og derfor brokker compileren
      //sig ikke
    else if (p2 instanceof Plane)
      ((Plane)p2).fly();
    else
      System.out.println("you're not in a car");

    //den kan caste begge veje, både højere og lavere i hierarkiet
    //alle klasser extender fra object. Hvis en klasse ikke arver fra nogen så arver den fra object.
    //det er object's metoder der så kommer frem

    //---------------------------------------------

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    vehicles.add(new Plane("JetFighter"));
    vehicles.add(new Car("Fiat 127"));
    vehicles.add(new Plane("Skyrider"));
    vehicles.add(new Vehicle("vx")); // man kan gøre dette men det giver ikke logisk mening at have en vehicle i garagen

    for (int i=0; i<vehicles.size(); i++){
      Vehicle temp = vehicles.get(i);
      System.out.print(temp.getName());
      temp.startEngine();

      if (temp instanceof Car){
        ((Car)temp).drive();
      } else if (temp instanceof Plane){
        ((Plane)temp).fly();

      }
    }

    //abstrakt klasse er en man ikke kan instantiere. Bruges til superklasser så man ikke laver objekter af dem
    //bare skriv "abstract" før class


  }

  public static void main(String[] args) {
    new Demo().go();
  }
}
