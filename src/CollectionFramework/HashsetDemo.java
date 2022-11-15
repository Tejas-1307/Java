package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashsetDemo {

    int id;

    String name;

    String Address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashsetDemo that = (HashsetDemo) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(Address, that.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Address);
    }

    public HashsetDemo(int id, String name, String Address) {
        this.id = id;
        this.name=name;
        this.Address=Address;
    }

    public static void main(String[] args) {
        HashsetDemo obj = new HashsetDemo(1,"Peter","pune");
        HashsetDemo obj1 = new HashsetDemo(1,"Peter","pune");
        HashsetDemo obj2 = new HashsetDemo(2,"Domnic","pune");

        Set<HashsetDemo> set = new HashSet<>();
        set.add(obj);
        set.add(obj1);
        set.add(obj2);

        set.forEach(HashsetDemo ->{
            System.out.println(HashsetDemo.id+" "+HashsetDemo.name+" "+HashsetDemo.Address);
        });
    }
}
