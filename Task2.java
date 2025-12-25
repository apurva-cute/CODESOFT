import java.util.*;
public class Task2 {
    
    public static void main(String s[])
    {
        int s1[]=new int[5];
        double marks,per,total=0;
        String grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator\nEnter 5 subject Marks\n");
        for(int i=0;i<5;i++)
        {
            s1[i]=sc.nextInt();
            total=total+s1[i];
        }
        per=(total/5)*100;
         if (per >= 90)
            grade = "A";
        else if (per >= 75)
            grade = "B";
        else if (per >= 60)
            grade = "C";
        else if (per >= 40)
            grade = "D";
        else
            grade = "F";
        System.out.println("Grade="+grade);
    }
    
}
