abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("you are create a new animal");
    }
}

class horse extends animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class peacock extends animal{
    public void walk (){
        System.out.println("walks on 2 legs");
    }
}
interface Animal{
void walk();

}
class Horse implements Animal{
     public void walk(){
        System.out.println("walks on the 4 legs");
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse horse=new horse();
        horse.walk();
        
    }
}
