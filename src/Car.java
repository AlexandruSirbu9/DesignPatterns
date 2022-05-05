public abstract class Car {
    abstract String getName();
   abstract String getTires();

    private String color;

    public void Change(String color){
        this.color = color;
    }

    public void Run(){
        if (color.equals("red")){
            System.out.println("Car stops: " + this.getName());
        }else if (color.equals("green")){
            System.out.println("Car runs : " + this.getName());
        }else {
            System.out.println("Car is not at the traffic light. ");
        }
    }

    public void Go(){
        System.out.println("Car go.");
    }

    public void Stop(){
        System.out.println("Car stop.");
    }


}
