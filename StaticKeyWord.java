package Ooops;
import Ooops.*;
public class StaticKeyWord {
    static {
        System.out.println("in block1");
    }
    static{
        System.out.println("in block2");
    }
    public static void main(String[] args){
        A obja = new A();
        A.B objb=obja.new B();
        A.C objc=new A.C();
System.out.println("in main");
    }

    static{
        System.out.println("in block3");
    }
}
