public class HW7 {
static void  counter(int start,int finish){
    int a;
    a=start;
    int b;
    b=finish;

    while (a<b){
        a+=2;
        System.out.println(a);
    }

}
    static void  counter(double start,double finish){
        double a;
        a=start;
        double b;
        b=finish;

        while (a<b){
            a+=2;
            System.out.println(a);
        }

    }


static void converter(int n){
    int temp;
    temp = n % 8;
    if (n>=8)
        converter(n/8);

}
    public static void main(String[] args) {
    int n = 68;
    converter(n);
    counter(2,23);
      }

}
