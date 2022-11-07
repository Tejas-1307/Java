package AbstractDemo;

public class Football extends  Sports {

    @Override
    public void play() {
        System.out.println("Playing Football");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exerscise();

        Hockey obj1 = new Hockey();
        obj1.show();
    }
}

class Hockey extends Football{

    public void show(){
        System.out.println("Playing Hockey");
    }
}

class Cricket extends Sports{

    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.play();


    }
}
