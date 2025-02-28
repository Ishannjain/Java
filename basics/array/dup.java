import java.util.*;
class dup{
    public static boolean search(int in,int arr[]){
int length=arr.length-1;

    }
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    ArrayList<ArrayList<Integer>> clock=new ArrayList<>();
    ArrayList<Integer> inclock=new ArrayList<>();
    int arr1[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
    int n;
    n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
    for(int j=0;j<=1;j++){
        arr[j]=sc.nextInt();
        inclock.add(arr[i]);
    }
    clock.add(inclock);
    }
    for(int i=0;i<n;i++){
        clock.get(i);
        for(int j=0;j<2;j++){
            inclock.get(j);
            while(search(inclock.get(j),arr1)!=false){
for(int k=0;k<n;k++){
     
}
            }
        }
    }
    
}
}