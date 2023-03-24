package cycle2;

import java.util.*;  
class Employee {
    int eNo;
    String eName;
    int eSalary;
    static Scanner sc= new Scanner(System.in);

    public void read(){
        System.out.print("Enter ID : "); 
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : "); 
        eName = sc.nextLine();
        System.out.print("Enter monthly salary : "); 
        eSalary = Integer.parseInt(sc.nextLine());
    }

    public String toString() {
    	return "Name : "+ eName +" Salary : "+ eSalary;
    }
    
    public static void main(String []args){
        int i,n;
        int No;
        System.out.println("Enter Number of Employees : ");
        n=Integer.parseInt(sc.nextLine());
        Employee emp[] = new Employee[n];
        for(i=0;i<n;i++){
            emp[i] = new Employee();
            emp[i].read();
        }
        System.out.println("Search, to exit enter 00"); 
        while(true){

            for(i=0;i<n;i++){
                System.out.print("Enter ID : "); 
                No = Integer.parseInt(sc.nextLine());
                if (No==0) {
                	System.out.println("Bye!");

                	System.exit(0);
                }
                if(emp[i].eNo == No){
                	System.out.println(emp[i]);
                }
                else {
                	System.out.println("No such ID");
                }

            }
        }

    }
}