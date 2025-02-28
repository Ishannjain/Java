package sorting;

public class insertion {
    public static void main(String[] args) {
        int array[]={9,4,3,5,2};
        for (int i=1;i<array.length;i++){
            int current=array[i];
            int j=i-1;
            while(j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        
        }
    }
}
