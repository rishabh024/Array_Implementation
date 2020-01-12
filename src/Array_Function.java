import java.util.*;
import java.lang.*;


public class Array_Function {
    public void sum(int [] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("Sum of array is "+ sum);
    }

    public void avg (int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        float av = sum/(a.length);
        System.out.println("Average of array is "+av);
    }

    public void insertInArrayAtLastPos(int[] a,int element){
        a[a.length - 1] = element;
        System.out.println("Your element is inserted at last \n new array is ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }

    public void insertInArrayAtIndex(int[] a,int element,int index){
        a[index] = element;
        System.out.println("Your element is inserted at given index \n new array is ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public void deleteFromArrayFromLastIndex(int[] a){
        a[a.length - 1]=0;
        System.out.println("Your element is deleted from Array from last index \n new array is ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public void deleteFromArrayFromIndex(int[] a,int index){
        a[index]=0;
        System.out.println("Your element is deleted from given index \n new array is ");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }



    public void searchInArray(int[] a,int element){
        int f=0;
        int indx11=-1;
        for(int i=0;i<a.length;i++) {
            if (a[i] == element) {
                f = 1;
                indx11=i;
                break;
            }
        }
        if(f==1)
            System.out.println("Element is searched in array at index-" + indx11);
        else
            System.out.println("Element is not searched in array");
    }
    public void sortedArray(int[] a,char order){
        //if char is d- then array is sorted in descending order
        //if char is a- then array is sorted in ascending order
        int temp=0;
        if('d'==order){
            for(int i=0;i<a.length;i++){
                if(a[i]<a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            System.out.println("Array in descending order is-");
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);
        }
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]>a[i+1]){
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            System.out.println("Array in ascending order is-");
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);
        }
    }
}
