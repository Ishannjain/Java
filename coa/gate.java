public class gate {
    
    public static void main(String[] args) {
        int []a={1,0,1,0,1};
        int []b={0,1,1,0,1};
        System.out.println("NAND");
for(int i=0;i<a.length;i++){
    if(a[i]==0 && b[i]==0){
        System.out.print(1);
    }
else{
    System.out.println(0);
}

    }
    System.out.println("NOR");
for(int i=0;i<a.length;i++){
    if(a[i]==1 && b[i]==1){
        System.out.println(0);

    }else{
        System.out.println(1);
    }
}
System.out.println("Half adder");
int [] aa={0,0,1,1};
int [] bb={0,1,0,1};
System.out.println("carry");
for(int i=0;i<aa.length;i++){
    if(aa[i]==1 && bb[i]==1){
System.out.println(1);
    }
    else{
        System.out.println(0);
    }}
    System.out.println("sum");
    for(int i=0;i<aa.length;i++){
        if((aa[i]==0 && bb[i]==0)||(aa[i]==1 && bb[i]==1)){
System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

}
}