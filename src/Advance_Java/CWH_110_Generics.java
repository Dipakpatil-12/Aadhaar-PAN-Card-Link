package Advance_Java;
import java.util.ArrayList;


/*
*Java Generics
-Introduced from JDK 5.0 onwards.
-The Java Generics helps us to deal with the compiler time type-safety.
-With the help of the Generics, we can write a single method and call it with different argument types(integer, strings, etc.).

*Advantages of Generics :
1.Bugs can be detected at compile-time:
-While developing any application or program, it is always better to catch the bug/problem at the compile-time instead of runtime
 so that we can provide a smooth experience to the user.

 */
//Code as described/written in the video :
class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class CWH_110_Generics {
    public static void main(String[] args) {

//        Without Java Generics :

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value
        System.out.println(myArrayList);

        /*
        In the above code, notice that we can store any type of object in a collection without Generics.
        But, this is not the case with the Generics. It allows us to store only one type of object. Take a look at the
        example given below :
         */

        //        With Java Generics :

        ArrayList<Integer> myArrayList1 = new ArrayList();
        myArrayList1.add(10);  //Integer value
//        myArrayList1.add("Dipak Bhai!"); //String value
//        myArrayList1.add(20.7); //Double value    ---->The same code produces the Incompatible type error because we can only store the integer object type.
        System.out.println(myArrayList1);

        /*
        2.Type-casting not required :
Let's suppose you created an ArrayList(without using Generics), and you want to store the value at index 0 into an
integer variable named "x." Are you allowed to do this in Java? The answer is a big NO! This is because the ArrayList
 returns an object, but we're storing the value in an integer variable. In such cases, we need to type-cast the object
  into our desired data type. But, if we use Generics, then there is no need to typecast. Take a look at the below example
   to get a better understanding :
         */

        //        Without Java Generics :

        ArrayList myArrayList2 = new ArrayList();
        myArrayList2.add(10);  //Integer value
        myArrayList2.add("Harry Bhai!"); //String value
        myArrayList2.add(20.4); //Double value

//        int x = myArrayList2.get(0);
//        System.out.println(x); ----> The above code produces an error because we've not typecasted the object into the
//                                     integer type. Now, let's typecast and see the results :

        //        Without Java Generics :

        ArrayList myArrayList3 = new ArrayList();
        myArrayList3.add(10);  //Integer value
        myArrayList3.add("Harry Bhai!"); //String value
        myArrayList3.add(20.4); //Double value

        int x = (int) myArrayList3.get(0); //b=object typecasted into integer
        System.out.println(x);

        //Now, let's see how we can get the desired results with the help of the Generics:

        //        With Java Generics :

        ArrayList<Integer> myArrayList4 = new ArrayList();
        myArrayList4.add(10);
        myArrayList4.add(20);
        myArrayList4.add(30);
        myArrayList4.add(40);

        int x1 = myArrayList4.get(0);
        System.out.println(x1);


        //Code as described/written in the video :


        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
                arrayList.add(54);
                arrayList.add(643);
//        arrayList.add(new Scanner(System.in));

        int a = (int) arrayList.get(0);
//        System.out.println(a);
                MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my Spark_2_0_Java_Full_Stack_.string ", 45);
                String str = g1.getT1();
                Integer int1 = g1.getT2();
                System.out.println(str + int1);
    }
}
