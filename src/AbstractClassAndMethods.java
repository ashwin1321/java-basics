// Abstract in english means existing in through or as an idea without concrete existence.
// --> Abstract class cannot be instantiated.
// --> we have to entend it if we want to access it
// --> it can include abstract and non-abstract methods
// -->  it class includes anstract methods, then the class iteself must be declared abstract.

//public abstract class phone Model {
//    abstract void switch off ();
//              || more code
//}

// ABSTRACT CLASS ARE USED WHEN WE WANT TO ACHIEVE SECURITY & ABSTRACTION(HIDE CERTAIN DETAILS & SHOW ONLY NECESSARY DETAILS TO THE USER
// example::

//abstract class Phone{
//    abstract void on();
//}
//class SmartPhone extends Phone{
//    void run(){
//        System.out.println("Turning on...");
//    }
//    public static void main(String args[]){
//        Phone obj = new SmartPhone();
//        obj.on();
//    }
//}




public class AbstractClassAndMethods  {

    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        c.sayHello();
        //Child3 c3 = new Child3(); -- error
    }
}


abstract class Parent2{
    public Parent2(){
        System.out.println("base2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}