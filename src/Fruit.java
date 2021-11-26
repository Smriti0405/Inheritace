import java.util.Scanner;

public class Fruit {
    String name;
    String taste;
    public void eat(){
        Scanner s = new Scanner(System.in);
        name = s.next();
        taste = s.next();
        System.out.println("Name of fruit is: "+ name+" "+"Taste is: "+taste);
    }
}
class Apple extends Fruit{
    public void eat(){
        System.out.println("Name of fruit is apple. Taste is sweet.");
    }
}
class Orange extends Fruit{
    public void eat(){
        System.out.println("Name is Orange. Taste is sour.");
    }
}
class Show{
    public static void main(String[] args) {
        Apple a = new Apple();
        a.eat();
        Orange o = new Orange();
        o.eat();
    }
}
