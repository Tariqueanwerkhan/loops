//import java.util.*;
public class LoopPractice
{
    public static void main(String[] args)
    {

//        int i=1;
//        while(i<100){
//            System.out.println(i);
//            i=i*2;
//        do{
//            System.out.println(i);
//            i=i*2;
//        }
//        while(i<100);
/*
        int i, num = 20, sum = 0;
        for(i=1; i <= num; ++i) {
            sum = sum + i;
        }
            System.out.println("sum of first 20 natural numbers is = " + sum);
 */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"x"+i+"="+n*i);
//        }

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scan.nextInt();
        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }

         */
/*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int m = n;
        int sum = 0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum = sum+r*r*r;
        }
        if(sum==m)
            System.out.println("It's a Armstrong Number");
        else
            System.out.println("It's Not a Armstrong Number");

 */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scan.nextInt();
        int rev = 0, r;
        while(n>0)
        {
            r=n%10;
            rev = rev*10+r;
            n/=10;
        }
        System.out.println("Reverse Number "+rev);

 */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scan.nextInt();
        int m = n;
        int rev = 0, r;
        while(n>0){
            r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        if(rev==m)
            System.out.println("It's is a Palindrome");
        else
            System.out.println("It's is not a Palindrome");

 */

/*
AP

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int term = a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term = term+d;

        }
 */
/*
Fibo Ser

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Fibonacci Series");
        System.out.println("Enter number of Terms");
        int n=sc.nextInt();
        int a=0, b=1, c;
        System.out.print(a+","+b+",");
        for(int i =0; i<n-2; i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }

 */

/*nested for loop
        int count = 0;
        for(int i = 1; i<=5; i++){
            for(int j =1; j<=5; j++){
                ++count;
                System.out.format("%02d ",count);
                //System.out.print("("+i+","+j+") ");
            }
            System.out.println("");
        }

 */
/*
        for(int i = 1; i<=5; i++)
        {
            for(int j =1; j<=5-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        */
/*
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i<=j)
                    System.out.print(("* "));
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

 */
    }
}
