public class Animal{
    String name;
    int age;
    String color;

    static void barking(String animal){
        System.out.println(animal+" is barking...");
    }

    static void hungry(String animal){
        System.out.println(animal+" is hungry...");
    }

    static void sleeping(String animal){
        System.out.println(animal+" is sleep...");
    }

    public static void main(String[] args){
        System.out.println("This is a class of animal...");
    }
}
