public class Person {
    String name;
    String gender;

    Person(String name, String gender){
        this.gender = gender;
        this.name = name;
    }
    public String toString(){
        return ("Name: "+ name+" "+ "Gender: "+ gender);
    }
}
class Student{
    String name;
    String collegeName;

    Student(String name, String collegeName) {
        this.name = name;
        this.collegeName = collegeName;
    }
        public String toString(){
            return ("Name: "+ name+" "+ "College Name: "+ collegeName);
        }
}
class Teacher extends Person{
    int sal;
    String sub;
    Teacher(int sal, String sub, String name, String gender){
        super(name, gender);
        this.sal = sal;
        this.sub = sub;
    }
    public String toString(){
        return (super.toString()+" "+"Subject: "+ sub+" "+ "Salary: "+ sal);
    }
}
class CollegeStudent extends Student{
    int year;
    String branch;
    CollegeStudent(int year, String branch, String collegeName, String name){
        super(collegeName, name);
        this.branch = branch;
        this.year = year;
    }
    public String toString(){
        return (super.toString()+" "+"Branch: "+ branch+" "+ "College Name: "+ collegeName+" "+"Year: "+ year);
    }
}
class Out{
    public static void main(String[] args) {
        Person obj1 = new Person("aaa", "M");
        Student obj2 = new Student("bbb", "GLA");
        Teacher obj3 = new Teacher(80000, "eng","ccc", "M");
        CollegeStudent obj4 = new CollegeStudent(3, "cs", "GLA", "ddd");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}
