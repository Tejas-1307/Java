package StaticDemo;

public class StaticKeyword {

    int id;

    String name;

     static String companyName;

     static {
         companyName="Google";
     }

    public StaticKeyword(int id, String name) {
        this.id = id;
        this.name = name;

    }

      static  class inner{

        static int id=10;

        static String name="Ravindra";
    public  static void display(){

        System.out.println("static inner method");
    }
    }


    public static void show(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword(1,"Tejas");
        StaticKeyword obj2 = new StaticKeyword(2,"Amit");
        StaticKeyword obj3 = new StaticKeyword(3,"Jeevan");
        StaticKeyword obj4 = new StaticKeyword(4,"Manish");


        System.out.println(obj1.id+" "+obj1.name+" "+companyName);
        System.out.println(obj2.id+" "+obj2.name+" "+companyName);
        System.out.println(obj3.id+" "+obj3.name+" "+companyName);
        System.out.println(obj4.id+" "+obj4.name+" "+companyName);

        show();

        StaticKeyword obj = new StaticKeyword(1,"Tejas");

//        StaticKeyword.inner obj1 = obj.new inner();
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
        inner.display();
        System.out.println(inner.id+" "+inner.name);


    }
}
