import java.util.*;
import java.lang.*;


public class Array_Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] ar = new int[size];
        System.out.println("Enter elements in array");
        for (int i = 0; i < size; i++) {
            ar[i]=sc.nextInt();
        }

        Array_Function obj = new Array_Function();
        obj.sum(ar);
        obj.avg(ar);

        System.out.println("enter element to be inserted in array at last index");
        int ele = sc.nextInt();
        obj.insertInArrayAtLastPos(ar,ele);


        System.out.println("enter both element & index to be inserted in array at any index");
        int ele1 = sc.nextInt();
        int indx = sc.nextInt();
        obj.insertInArrayAtIndex(ar,ele1,indx);


        System.out.println("Do you want to delete element from array from last position-- tell Y or N");
        char c = sc.next().charAt(0);
        char ans = Character.toLowerCase(c);
        if(ans=='y'){
            obj.deleteFromArrayFromLastIndex(ar);
        }


        System.out.println("Do you want to delete element from array from any position-- tell Y or N");
        char c2 = sc.next().charAt(0);
        char ans2 = Character.toLowerCase(c2);
        if(ans2=='y'){
            System.out.println("enter index");
            int indx1 = sc.nextInt();
            obj.deleteFromArrayFromIndex(ar,indx1);
        }


        System.out.println("Do you want to Search element from array-- tell Y or N");
        char c1 = sc.next().charAt(0);
        char ans1 = Character.toLowerCase(c1);
        if(ans1=='y'){
            System.out.println("enter element for searching");
            int ele2 = sc.nextInt();
            obj.searchInArray(ar,ele2);
        }

        System.out.println("Do you want to Sort an array-- tell Y or N");
        char c3 = sc.next().charAt(0);
        char ans3 = Character.toLowerCase(c3);
        if(ans3=='y'){
            System.out.println("enter order- either d or a");
            char c4 = sc.next().charAt(0);
            obj.sortedArray(ar,c4);
        }
    }
}
