package mypackage1;

class ed{    // parent
    public int cal(int x, int y){
        return x+y;
    }
}

class ed1 extends ed {
    public int cal_adv(int x, int y) {
        return x-y;
    }
}
    class ed2 extends mypackage1.ed1 {
        public int calmul(int x, int y) {
            return x*y;
        }
    }
    class ed3 extends ed2 {
        public int caldiv(int x, int y) {
            return x/y;
        }
    }
public class inheritance {
    public static void main(String[] args) {
        ed1 a = new ed2 ();
        ed3 b = new ed3();
        ed2 c = new ed2();
        System.out.println(a.cal(2, 5));
        System.out.println(a.cal_adv(2, 5));
        System.out.println(a.cal(2, 5));
    }
}
