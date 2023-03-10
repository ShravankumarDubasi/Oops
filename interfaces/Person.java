package interfaces;

public class Person implements Student,Youtube {
    public  static void main(String[] args){
        Person obj=new Person();
        obj.study();
        obj.study();
        Youtube obj2= obj;


        }


    @Override
    public void study() {
        System.out.println("person is studying");
    }

   @Override
    public void makevedio() {
           System.out.println("making vedio");
    }
}
