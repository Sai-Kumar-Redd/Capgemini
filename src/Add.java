import java.util.*;

class Add {
    int a = 00;
    int b = 00;

    void add() {
        System.out.println(a + b);
    }
}

class Sub extends Add {
    void sub()

    {
        System.out.println(a - b);

    }
}
class Inheritance{
    public static void main(String[]args){
        Sub s =new Sub();
        s.add();
        s.sub();
    }
}
