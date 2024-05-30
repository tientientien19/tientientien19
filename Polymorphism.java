import java.util.Scanner;

class Vehicle {
    Vehicle() {  //Constructor
        System.out.println("Vehicle create");
    }
    final int yearsOld = 1000;
    void run(int a){
        System.out.println("running at "+ a +" km/h");
    }
    void run(long a){
        System.out.println("running at "+ a +" km/h"); //Overloading
    }
    {
        System.out.println("instance initializer block invoked"); //instance initializer block
    }

}
class WaveAlpha extends Vehicle {
    @Override
    void run(int a) {
        System.out.println("WaveA running at "+ a +" km/h"); //Overriding
    }
    void go(int a) {
        super.run(a);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        WaveAlpha a = new WaveAlpha();
        a.run(90);
        a.go(90);
        if (a instanceof Vehicle) {
            System.out.println("a is a vehicle!");
        }
        Scanner sc = new Scanner(System.in);
        
    }
}
