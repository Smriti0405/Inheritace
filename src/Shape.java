public class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle Shape");
    }
    public void erase(){
        System.out.println("Erasing Circle Shape");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing Triangle Shape");
    }
    public void erase(){
        System.out.println("Erasing Triangle Shape");
    }
}
class Display{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape t=new Triangle();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
    }
}
