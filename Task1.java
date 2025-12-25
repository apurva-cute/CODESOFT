import java.util.*;
class Task1
{
    public static void main(String[] args) {
        System.out.println("Welcoem to Guess GAme System");
        int rep=1,score=0;
        int ranNum=(int)(Math.floor(Math.random()*100));
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Rules\nGuess Number between 1 to 100\n5 Attempts");
        for(int i=5;i>=1;i--)
        {
            System.out.println("\nEnter the guessing:-");
            int guess=sc.nextInt();
            if(guess>ranNum){
                System.out.println("\nToo High!");

            }
            else if(guess<ranNum)
            {
                System.out.println("\nToo Low");
            }
            else if(ranNum==guess)
            {
                System.out.println("You Scored correct!");
                System.out.println("\n\t\t\tScore:- "+i);
                break;
            }
            System.out.println("Remainng attempts="+(i-1));
            if((i-1)==0){
                System.out.println("YOU LOOSe!");
            }
        }
        System.out.println("You wnat to repet the press 1");
        rep=sc.nextInt();
        }while(rep==1);
    }
}