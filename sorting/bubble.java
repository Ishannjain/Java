package sorting;

public class bubble {
    public static void main(String[] args) {
     int[] array={4,9,3,7,8};
     int size=array.length;
     for(int i=0;i<size-1;i++){
        for (int j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }}}
    for(int k=0;k<size;k++){
        System.out.print(array[k]+" ");

    }
    System.out.println();

                
        }
     
    
}
