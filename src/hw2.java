import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        Math.min(a,b);
        Math.max(a,b);

        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int mid = a + b + c - (min + max);
        System.out.print(mid);
        System.out.print("\n");

        System.out.print("Внесіть число від 1 до 24: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //System.out.println ( number);
        if (number>=1 && number<12){
            System.out.printf(" доброго ранку");
        }
        else if (number>=12 && number <20){
            System.out.printf(" доброго дня");
        }
        else if (number>=20 && number <=24){
            System.out.printf(" доброї ночі");
        }
        else System.out.print("Число не відповідає умові");
    }
}
