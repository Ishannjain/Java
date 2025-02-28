package sorting;

public class selection {
    public static void main(String[] args) {
        int array[]={9,5,3,1,8};
for(int i=0;i<array.length-1;i++){
    int smallest=i;
    for(int j=i+1;j<array.length;j++){
      if (array[smallest]>array[j]){
        smallest=j;
      }
    }
    int temp=array[smallest];
    array[smallest]=array[i];
    array[i]=temp;
}
for(int k=0;k<array.length;k++){
    System.out.print(array[k]+" ");

}
System.out.println();
    }
}
