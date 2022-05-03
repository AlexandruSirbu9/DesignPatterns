public class CarFactory {
    public Car getCar(String type){
        if("Bmw seria 3".equals(type)){
            return new Bmw();
        }else if ("Audi A4".equals(type)){
            return new Audi();

        }
        return null;
    }
}
