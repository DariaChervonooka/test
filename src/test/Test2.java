package test;

import com.sun.tools.javac.Main;

import static test.Test1.metod1;

public class Test2 {
    public static void main(String[] args) {
 metod1();
 Test1.metod3();
 Test1 obeck = new Test1(22,3);
        Test1 obeck1 = new Test1(2,6);
        Test1 obeck2 = new Test1(52,9);
        System.out.println(obeck.number+" " + obeck.numb2);
 Test3 ob1 = new Test3();
 obeck.metod2();
 ob1.metod2();

    }
}
