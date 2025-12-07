//*Create a class `Car` with a parameterized constructor (model, year). Print the values*//

public class Car {
    String model;
    int year;

   
    Car(String m, int y) {
        model = m;
        year = y;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
    }
}