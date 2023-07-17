import java.util.Scanner;


public class btodec{
public static void main(String[] args){
    int bin;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    bin=sc.nextInt();
    int dec=0;
    int i=0;
    while (bin>0) {
        int temp=bin%10;
        dec+=temp*Math.pow(2,i);
        bin=bin/10;
        i++;
        }
        System.out.println("Decimal="+dec) ;
}
}







