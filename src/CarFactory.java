public class CarFactory {
    public Car getCar(String type)
    {
        //am folosit instructiunea if pentru a ma ajuta sa compar tipul introdus cu unul dintre modelele folosite de mine,
        //daca ceea ce am introdus este egal cu modelul meu , atunci imi creaza o noua masina de tipul acela.
        if("Bmw seria 3".equals(type)){
            return new Bmw();
        }else if ("Audi A4".equals(type)){
            return new Audi();
        }
        return null;
    }
}
