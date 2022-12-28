package mypackage1;

public class stringarray1 {
    public stringarray1() {
    }

    public static void main(String[] args) {
        String[] str = new String[]{"Dipak", "Rutuja", "Arnav", "Yashmit", "Vismay"};
        System.out.println(str.length);

        for(int j = 0; j <= str.length - 1; ++j) {
            System.out.println(str[j]);
        }

    }
}
