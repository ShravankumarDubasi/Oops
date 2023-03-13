package passByValue;

public class Introo {
    public static void main(String[] args) {
        Cat c= new Cat();
       Cat d = new Cat();

        c.legs = 3;
       d.legs = 4;
        swap(c,d);
        System.out.println(c.legs+" "+d.legs);


    }

    static void swap(Cat a, Cat b) {
        Cat temp = a;
        a = b;
        b = temp;
//        System.out.println(a.legs+" "+b.legs);
    }
    static void change(Cat e,Cat f){
        e.legs=5;
        f.legs=6;

    }

}
class Cat{
    int legs;

}