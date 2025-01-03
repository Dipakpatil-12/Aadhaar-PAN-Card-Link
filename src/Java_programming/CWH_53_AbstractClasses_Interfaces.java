package Java_programming;
/*
*Abstract class :
An abstract class cannot be instantiated.
Java requires us to extend it if we want to access it.
 It can include abstract and non-abstract methods.
If a class includes abstract methods, then the class itself must be declared abstract, as in:

Abstract class are used when we want to achieve security & abstraction(hide certain details & show only
necessary details to the user)


* Abstract method :
A method that is declared without implementation is known as the abstract method.
An abstract method can only be used inside an abstract class.
The body of the abstract method is provided by the class that inherits the abstract class in which the abstract method is present.
In the above example, greet and greet1() is the abstract method.
 */
abstract class parent{
    public parent(){
        System.out.println("I am constructor of parent class");
    }
    public void sayhello(){
        System.out.println("Hello..");
    }
    abstract public void greet();
    abstract public void greet1();
}

class child extends parent {
    @Override
    public void greet() {
        System.out.println("Good morning..");
    }

    @Override
    public void greet1() {
        System.out.println("Good afternoon..");
    }
}

 abstract class child2 extends parent{
      public void th(){
          System.out.println("I am good..");
      }
}
public class CWH_53_AbstractClasses_Interfaces {
    public static void main(String[] args) {
       child c = new child();
       c.greet();
       c.greet1();
        //Parent p = new Parent(); -- error because abstract class does not create an object
        //Child2 c2 = new Child2(); -- error because abstract class does not create an object
    }
}
