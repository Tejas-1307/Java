package Inheritance;

public class collage {
    int id;
    String name;
    String address;

    public void set()
    {
        id=1;
        name="Tejas";
        address="Satara";
    }

    public void show()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Address="+address);
    }
}

class Teacher extends collage
{

    public void set()
    {
        id=1;
        name="Vaibhav";
        address="Pune";
    }

    public void show()
    {
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("Address="+address);
    }
}

class main
{
    public static void main(String[] args) {
        collage clg=new collage();
        clg.set();
        clg.show();

        Teacher t1=new Teacher();
        t1.set();
        t1.show();

    }
}




