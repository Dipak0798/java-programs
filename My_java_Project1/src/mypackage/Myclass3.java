package mypackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Myclass3 {
    public static void main(String[] args) throws IOException {
        int i=6; int j=10;
        System.out.println("Enter two number");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  // it will take input from the user
        i=Integer.parseInt(br.readLine());  // it will check the entered value is integer or not
        j=Integer.parseInt(br.readLine());   // String.parseString()
        System.out.println(i);
        System.out.println(j);
        int sum=j/i;
        int div=j/i;
        int mul=j*i;
        int sub=j-i;
        System.out.println(sum);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(sub);
    }
}