package mypackage1;
class shinde{
    int x;
    public void cal(){
        System.out.println("moolaed");

    }
}
public class multipleobjects {
    int y;
    public static void sus(){
        System.out.println("india");
    }

    public static void main(String[] args) {
        shinde n=new shinde();
        multipleobjects m=new multipleobjects();
        n.cal();m.sus();
    }
}

