package mypackage1;

public class overloading {
    public overloading() {
    }

    public static void cal1() {
        System.out.println("india");
    }

    public static void cal1(int z) {
        System.out.println(z % 2);
    }

    public static void cal1(String str) {
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        overloading m = new overloading();
        cal1();
        cal1(23);
        cal1("Dipak");
    }
}
