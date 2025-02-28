
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
public void printcolor(){
    System.out.println(this.color);
}
pen(String color,String type){
    this.color=color;
    this.type=type;
}
}
class Student{
String name;
int age;
public void printinfo(){
    System.out.println(this.age);
    System.out.println(this.name);
    
    }
    Student(){
        System.out.println("constructor called");
}
Student(Student s2){
    this.name=s2.name;
    this.age=s2.age;
}
}
public class oops{
    public static void main(String[] args){
        pen pen1=new pen("black","baLL");
      
        pen1.write();
        pen pen2=new pen("blue","gel");
       
        pen1.printcolor();
        pen2.printcolor();
        Student s1=new Student();//constructer
        s1.name="ishan";
        s1.age=19;
        Student s2=new Student(s1);
        s2.printinfo();

    }
}