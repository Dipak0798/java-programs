package mypackage1;

    class dipak{
    int id; String surname;
    public void met(){
        System.out.println(id);
        System.out.println(surname);
    }
    public void  met1(){
        int x=id+2;
        System.out.println(x);
        System.out.println(surname.length());
    }
}
public class insideclass {

    public static void main(String[] args) {
        dipak su=new dipak();
        su.id=501; su.surname="shinde";
        su.met();
        su.met1();
    }
}
