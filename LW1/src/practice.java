class Car{
    String brand;

    void start(){
        System.out.println(brand+" car is starting.");
    }
}




public class practice {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Toyota";

        car1.start();
    }
}
