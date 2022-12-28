package mypackage;

public class dipak {
    public static void main(String[] args) {
        String str="DIPAK"; String str1="dipak"; String str2= "    Dipak shinde    "; char ch=' ';
        System.out.println(str.length());  //used for printing the length of the string
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str2.trim());
        System.out.println("DIPAK" +' '+ "dipak");   // + -->  artithemtic operator +---> concat
        System.out.println(str.replace('D','R'));
        System.out.println(str);
    }
}
