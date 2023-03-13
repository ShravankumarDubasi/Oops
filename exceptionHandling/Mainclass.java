package exceptionHandling;

public class Mainclass {
    public static  void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of range");
        }catch(IllegalArgumentException e){

        }finally{
//            runs every time with exception and without also
        }
        System.out.println("need to run" );
    }
}
