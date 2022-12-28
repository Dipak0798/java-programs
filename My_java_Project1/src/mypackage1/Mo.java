package mypackage1;

import java.util.Scanner;

public class Mo {
    public static void op(int i, int j, int w) {
        for (j = i; j >= 1; j--) {
            for (w = 1; w <= j; w++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void op(int i, int j) {


        System.out.println("addition of two nos is" + (i + j));
        System.out.println("subtraction of two nos is" + (i - j));
        System.out.println("division of two nos is " + (i / j));
        System.out.println("multiplication of two nos is" + (i * j));

    }

    public static void op(String st, int w) {
        System.out.println(" my name is " + st + " and my age is " + (w));

    }

    public static void op(String st, String scc) {
        System.out.println("my name is " + st + " my surname is " + scc);

    }

    public static void op(String st) {
        System.out.println("string lowercase is " + st.toLowerCase());
        System.out.println("string trim is " + st.trim());
        System.out.println("string replace is " + st.replace('A', 'c'));
        System.out.println("string length is " + st.length());
        System.out.println("string character is at " + st.charAt(1));
    }

    public static void op(char c) {
        System.out.println(c);
    }


    public static void op(int[] k) {
        System.out.println("integer array length is " + k.length);
        {
            for (int s = 0; s <= k.length - 1; s++) {
                System.out.println("integer array values are " + k[s]);

            }
        }
    }

    public static void op(String[] z) {
        System.out.println("String  array length is " + z.length);
        {
            for (int p = 0; p <= z.length - 1; p++) {
                System.out.println("string array values are " + z[p]);

            }
        }
    }

    public static void op(int cost) {
        if (cost >= 100 && cost <= 150) {
            System.out.println("icecream");
        } else if (cost >= 150 && cost <= 200) {
            System.out.println(" kebab1");
        } else if (cost >= 200 && cost <= 250) {
            System.out.println(" kebab2");
        } else if (cost >= 250 && cost <= 300) {
            System.out.println("biryani");
        } else {
            System.out.println("mutton biryani");

        }

    }
    public static void op(int i, int j ,int w,String scc) {
        switch (w) {
            case 1:
                System.out.println("add two numbers" + (i + j));
                break;
            case 2:
                System.out.println("sub two numbers" + (i - j));
                break;
            case 3:
                System.out.println("multiply two nos" + (i * j));
                break;
            case 4:
                System.out.println("div two numbers" + (i / j));
                break;
            default:
                System.out.println("not applicable");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//take the input from the user
        int i = sc.nextInt();//checks whether the input is int
        int j = sc.nextInt();
        int w = sc.nextInt();
        char c = sc.next().charAt(0);
        int cost = sc.nextInt();
        String st = sc.nextLine();
        String scc = sc.nextLine();//checks whether input is string
        int k[] = {11, 22, 333};
        String z[] = {"alok", "alok1", "alok2"};
        Mo a = new Mo();
        a.op(i, j, w);
        a.op(i, j);
        a.op(st);
        a.op(k);
        a.op(z);
        a.op(cost);
        a.op(st, w);
        a.op(st, scc);
        a.op(c);
        a.op(i,j,w,scc);
    }
}
