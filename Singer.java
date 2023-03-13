package Ooops;

public class Singer extends Persone {
    public void sing(){
        System.out.println("singer"+name+"is singing");
    }
    public void eat(){
        super.eat();
        System.out.println("singer is eating");
    }
}
