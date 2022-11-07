package Polymorphism;

//method overriding-- if two class have same method with same signature
//advantage-- you are implementing parent class method in child

public class Animal {

    public  void  sound(){
        System.out.println("Animal sound");
    }
}

class  cat extends  Animal{

    public  void  sound(){
        System.out.println("cat sound");
    }

    public static void main(String[] args) {
        cat obj = new cat();
                obj.sound();



    }
}
