

// import java.util.Arrays;

public class pos_neg_alternate {

    public static void main(String[] args) {
        int[] array={5,-1,-4,-3,2,1};
        int size=0;
        int size2=0;
        int[] neg=new int[size2];
        int[] pos= new int[size];
        
        for(int i=0;i<array.length;i++){
            if(array[i]>=0){
                size++;
                pos[size]=array[i];
            }else{
                size2++;
                neg[size2]=array[i];
            }

        }
        System.out.println(pos);
        System.out.println(neg);
    }
}
