package Ooops;

public class Inheritance {
    public static  void main(String[] args){
        Teacher t1=new Teacher();
        Singer s1=new Singer();
        s1.name="gopi";
        t1.name="sravan ";
        t1.eat();

        t1.drink();
        s1.eat();
        Persone p=t1;
        Teacher t=(Teacher) p;

        System.out.println(p instanceof Teacher);
        System.out.println(t instanceof Persone);


    }
}
