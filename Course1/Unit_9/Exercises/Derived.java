package Exercises;

public class Derived extends Base{
    private String infod;
    public Derived(){
        super();
        infod = "I am an object of the Derived class";
    }
    public String getInfo(){
        return infod + " " + super.getInfo();
    }
}
