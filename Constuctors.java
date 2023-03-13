package Ooops;

public class Constuctors {
    public static void main(String[] args){

        vehicle bike=new vehicle(2);
        vehicle rikshae=new vehicle();
        vehicle car=new vehicle(4,"black");
        System.out.println(bike.wheels);
        System.out.println(car.wheels+" "+car.color);
    }

}
class vehicle{
    int wheels;
    String color;
    vehicle (int wheels){
        this.wheels=wheels;

    }
    vehicle (int wheels,String color){
        this.wheels=wheels;
        this.color=color;
    }
    vehicle(){

    }



}