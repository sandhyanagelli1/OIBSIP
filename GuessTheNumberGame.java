import java.util.*;
public class GuessTheNumberGame {
    public static void main (String args[]) {
        Random rnum= new Random();
        int rd=0;
        int guess=rnum.nextInt(100);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Guess the number from 1 to 100 ,you will have 10 chances to guess");
            int g;
            int i=0;
            boolean w=false;
            while(w!=true)
            {
                g=sc.nextInt();
                rd++;
                if(g==guess){
                    w=true;
                }
                else if(i>8)
                {
                    System.out.println("Lost the right guess is "+ guess);
                    return;
                }
                else if(g<guess)
                {
                    i++;
                    System.out.println("Guess is lower than the number ! chances left :"+(10-i));
                }
                else if(g>guess)
                {
                    i++;
                    System.out.println("Guess is higher than the number ! chances left :"+(10-i));
                }
            }
        }
        System.out.println("Win !!");
        System.out.println("The Random number is "+guess);
        System.out.println("Chances used is "+rd+"For guessing the number");
        System.out.println("Score is "+((11-rd)*10)+"out of 100");

    }
}