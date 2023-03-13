package Ooops;


    class Cat {
        String name, breed;
        int legs, eyes;

        public void walk() {
            System.out.println("Cat " + name + "is Walking");
        }

        public void running() {
            System.out.println("Cat " + name + " is running");
        }
        public void description(){
            System.out.println("Cat has"+legs+"legs and "+eyes+"eyes");
        }
    }

        public class Intro {
            public static void main(String[] args) {
                Cat cat1 = new Cat();
                Cat cat2 = new Cat();
                cat1.name="ooli";
                cat1.legs=12;
                cat1.eyes=2;
                cat1.description();
                cat1.running();


            }
        }

