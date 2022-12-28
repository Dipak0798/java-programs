package mypackage1;
class ch {
    private int id; private int salary;
    public void set (int i,int j){
        id=i;
        salary=j;

        System.out.println(j);
    }
    public int get(){
        return id;
    }
}
public class gettersetter {
    public static void main(String[] args) {
        ch c=new ch();
        c.set(1234,91000);

        System.out.println(c.get());
    }
}
