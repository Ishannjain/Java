package inheritance;
class shape{
    public void area(){
        System.out.println("displays area");
    }
}
class triangle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
class equilateral  extends triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}
public class single_multi_hierarchical
 {
    public static void main(String[] args) {
        triangle s1=new triangle();
        s1.area();    }
}
