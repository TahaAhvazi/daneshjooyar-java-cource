public class Car extends Vehicle {
    private String modelName = "bmw model 1";
    // Let's create an object from car class!
    public static void main(String[] args){
        Car carObject = new Car();
        carObject.start();
        System.out.println(carObject.brand);
    }

}
