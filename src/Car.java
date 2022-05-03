public abstract class Car {
    String getName(){
        return null;
    }
    String getTires(){

        return null;
    }

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

}
