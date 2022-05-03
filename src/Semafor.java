import java.util.ArrayList;
import java.util.List;

public class Semafor {
    private String color;
    private List<Car> carList = new ArrayList<>();//Lista de observatori

    public void addCar(Car car){
        this.carList.add(car);
    }
    public void removeCar(Car car){
        this.carList.remove(car);
    }

    public void changeColor (String color){
        this.color = color;
        for (Car car:this.carList) {
            car.Change(color);
        }
    }
}
