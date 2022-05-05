import java.util.ArrayList;
import java.util.List;

public class Semafor {
    private String color;
    private List<Car> carList = new ArrayList<>();//Lista de observatori
// addCar ma ajuta sa adaug masini la lista mea
    public void addCar(Car car){
        this.carList.add(car);
    }
    //removeCar ma ajuta sa sterg masini din lista mea
    public void removeCar(Car car){
        this.carList.remove(car);
    }

    public void changeColorCar (String color){
        this.color = color;
        for (Car car:this.carList) {
            car.Change(color);
        }
    }
    //Metoda changeColor ajuta la scimbarea culorii semaforului si notificarea observatorilor
    public void changeColor(String color){
        this.color = color;
        if (color == "green"){
            for (Car car:this.carList) {
                car.Go();
            }
        }else if(color == "red"){
            for (Car car:this.carList) {
                car.Stop();
            }
        }else {
            System.out.println("Culoare introdusa poate fi doar verde sau rosu.");
        }
    }
}
