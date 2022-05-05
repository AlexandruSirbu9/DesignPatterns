public class Main {
    public static void main(String[] args) {
        //se creaza un obiect de tip CarFactory
        CarFactory carFactory = new CarFactory();

        Car c1 = carFactory.getCar("Bmw seria 3");
        Car c2 = carFactory.getCar("Audi A4");

        //se creaza un obiect de tip Semafor
        Semafor semafor = new Semafor();

        semafor.addCar(c1);
        semafor.addCar(c2);

        semafor.changeColor("red");
        semafor.changeColor("green");


        //Am folosit design pattern-ul Factory pentru a crea obiectul fara a expune logica de constructie clientului
        //Am folosit design pattern-ul Observer pentru a dirija masinile in trafic


    }
}
