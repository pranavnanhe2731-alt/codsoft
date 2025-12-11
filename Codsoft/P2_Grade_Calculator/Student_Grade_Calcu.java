import java.util.*;
public class Student_Grade_Calcu {
    public static void Grade(double avg){
        if(avg>=75&&avg<=100){
            System.out.println("Grade A");
        }
        else if(avg<75&&avg>=60){
            System.out.println("Grade B");
        }
        else if(avg<60&&avg>=45){
            System.out.println("Grade C");
        }
        else if(avg<45&&avg>=35){
            System.out.println("Grade D");
        }
        else if(avg<35&&avg>=0){
            System.out.println("Fail..");
        }   

    }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("====STUDENT GRADE CALCULATOR====");
    System.out.print("Enter The Number Of Subject : ");
    int n=sc.nextInt();
    System.out.println();
    Double sum=0.0;
    double[] marks=new double[n];
    for(int i =0;i<n;i++){
        System.out.print("Enter the marks of Subject "+(i+1)+" :");
        marks[i]=sc.nextDouble();
        sum+=marks[i];
    }
    double avg = sum/n;
    System.out.println();
    System.out.println("The Total Sum of Marks is : "+sum);
    System.out.println("The Average Percentage is : "+avg);
    Grade(avg);
    sc.close();
   }
}
