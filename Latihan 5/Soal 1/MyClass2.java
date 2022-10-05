public class MyClass2 {
    int x = 5;
    int y = 3;
    int z;
    int a = 10;

    public static void main(String[] args) {
        MyClass2 myObj = new MyClass2();
        System.out.println(myObj.x);

        myObj.z = 40;
        System.out.println(myObj.z);

        myObj.a = 25; //x is now 25
        System.out.println(myObj.a);

        MyClass2 myObj1 = new MyClass2(); // object 1
        MyClass2 myObj2 = new MyClass2(); // object 2

        myObj2.x =25;
        System.out.println(myObj1.x); //output 5
        System.out.println(myObj2.x); // output 25
    }
}