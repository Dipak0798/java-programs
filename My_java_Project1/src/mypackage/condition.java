package mypackage;

public class condition {
    public static void main(String[] args) {
        int age=12;
        if (age>=18){       // >=, <=
            System.out.println("elegible to vote");
        }
        else if (age<=12){
            System.out.println("you are a baby");
        }
        else {
            System.out.println("not elegible");
        }
    }
}