package mypackage1;

public class proparray {
    public proparray() {
    }

    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3, 4, 5};
        int prod = 1;

        for(int j = 0; j < i.length; ++j) {
            prod *= i[j];
        }

        System.out.println(prod);
    }
}
