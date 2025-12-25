import java.util.*;
public class Task3 {
    public static void main(String s[])
    {
        int rep=1;
        System.out.println("Currency Converter!");
        do{
                    System.out.println("1. INR to USD\n2. USD to INR\n3. INR to EUR\n4. EUR to INR ");
        System.out.println("Enter the choose:-");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        System.out.println("Enter the Money to convert");
        int amount=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Amount= $"+(amount * 0.012));
                break;
            case 2:
                System.out.println("Amount= ₨"+(amount*83.0));
                break;
            case 3:
                 System.out.println("Amount= Rs"+amount*0.011);
                 break;
            case 4:
                System.out.println("Amount= Rs"+amount*90.0);
                 break;
            default:
                System.out.println("Default choice");
                break;
        }
        System.out.println("You want to convert again then press 1");
        rep=sc.nextInt();
        }
        while(rep==1);
    }
    
}
