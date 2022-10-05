public class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name){
        modelYear= year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car mycar = new Car(1998,"Mustang");
        System.out.println(mycar.modelYear +" "+ mycar.modelName);

    }
}