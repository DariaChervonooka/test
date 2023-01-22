package test;

public class Test1 {
    int number ;
    int numb2 = 22;

    public Test1(int number, int x) {
        this.number = number;
        numb2 = x;
        //System.out.println(number+" " + numb2);
    }

    static void metod1(){
        System.out.println("hello from static method");
    }
    public void metod2(){
        System.out.println("hello from public method test1");
    }
    public static void metod3(){
        System.out.println("hello from public static method");
    }

}
