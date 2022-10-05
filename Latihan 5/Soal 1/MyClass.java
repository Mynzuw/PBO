public class MyClass {
    int x; // class attribute

    public MyClass(int y){
        x=y;
    }
    // Create a class constructor for the Myclas class
    public MyClass(){
        x = 5; // set the initial value for the class attribut x
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass(); //create an object of Class MyClas
        System.out.println(myObj.x);//print the value of x

        MyClass myObj1 = new MyClass(5);
        System.out.println(myObj1.x);
    }
}