public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car c1 = carFactory.getCar("Bmw seria 3");
        Car c2 = carFactory.getCar("Audi A4");
        Semafor semafor = new Semafor();
        semafor.addCar(c1);
        semafor.addCar(c2);
        semafor.changeColor("red");

        c1.Run();
        c2.Run();

        semafor.changeColor("green");

        c1.Run();
        c2.Run();


    }
}
