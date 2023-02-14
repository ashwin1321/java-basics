// Interface in java:
// --> similar to class i.e the collection of related methods, interface in java is a collection of abstract methods
// --> One or more way to achieve abstraction in java
// --> contains constants, methods, static methods
// --> 'interface' keyword is used to declare interface
// --> no need of writing abstract, interface is implicitly abstract
// --> no constructor
// to implement interface 'implement" keyword is used

// EXAMPLE:
//interface Bicycle {
//    void applybrake ( int decrement );
//    void  speedup ( int increment );
//}
//
//class Avon cycle implements Bicycle {
//    int speed = 7 ;
//    void applybrake ( int decrement ) {
//        speed = speed - decrement ;
//    }
//    void speedup ( int increment ){
//        speed = speed + increment ;
//    }

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
    public void blowHornK3g(){
        System.out.println("pee pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("blow me");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycle.a);
        System.out.println(cycle.x);

        // You cannot modify the properties in Interfaces as they are final
        // cycle.a = 454;
        //System.out.println(cycle.a);

        cycle.blowHornK3g();
        cycle.blowHornmhn();
    }
}
