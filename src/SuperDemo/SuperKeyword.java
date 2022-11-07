package SuperDemo;

/*
*1.it refers the immediate parent class variables
* 2.it refers the immediate parent class method.
* 3.it refers immediate parent class constructor.
 */

public class SuperKeyword {

    int i=10;

    public  void show(){
        System.out.println("in super");

    }

    public SuperKeyword(){

        System.out.println("in super const");
    }

    public SuperKeyword(int i){
        System.out.println("in super constructor");

    }
}

class Sample extends SuperKeyword{

    int i =20;

    public Sample(){
//        super(7);
        System.out.println("Sample Cost");
    }

    public Sample(int i){
        super(i);
        System.out.println("in sample parameter");

    }

    public void display(){
        super.show();
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        Sample obj = new Sample(7);
//        System.out.println(obj.i);
//        obj.display();
    }



}
