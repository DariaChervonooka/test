public class HW1 {
    public static void main(String[] args) {
        String name = "Daria ";
        String surname = "Chervonooka";
        String ns = name + surname;
        System.out.printf(ns);


        float a = 1.4F;
        float b = 1.4F;
        float c = a+b;
        System.out.print("\n");
        System.out.print(c);
        System.out.print("\n");

        int number =123;
        int hundred = number / 100;
        System.out.println(hundred);
        int ten = number / 10 % 10;
        System.out.println(ten);
        int  unit =number % 10;
        System.out.println(unit);


    }
}
