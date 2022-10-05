public class Person {
        String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: "+ myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
