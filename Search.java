package cycle2;

import java.util.*;

class Search {

    public static void main(String[] args) {
        int[] array = new int[10];
        int i,count,search,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        count = sc.nextInt();
       
        System.out.print("Enter matrix elements : ");
        for (i = 0; i < count; i++) {
                array[i] = sc.nextInt();    
        }
        System.out.print("Enter element to be search : ");
        search = sc.nextInt();
        for(i = 0; i < count;i++){
            if(array[i] == search){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element present");
        }
        else{
            System.out.println("Element not present");
        }
    }
}