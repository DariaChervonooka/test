package hw8;

import hw8.HW8Dogs;

public class HW8dogsMain {
    public static void main(String[] args) {
        HW8Dogs.method1();
        HW8Dogs object = new HW8Dogs("poodle","female","Karamel'ka",1);
        HW8Dogs object1 = new HW8Dogs("poodle","male","Torr",1);
        HW8Dogs.method2();
        HW8Dogs object3 = new HW8Dogs("poodle","male","Mars",1);
        HW8Dogs object4 = new HW8Dogs("poodle","female","Meggi",1);
        HW8Dogs.method3();
        HW8Dogs object5 = new HW8Dogs("alabai","female","Dora",13);
        System.out.println(object.breed+" "+object.sex+" "+object.name+" "+object.age);
    }
}
