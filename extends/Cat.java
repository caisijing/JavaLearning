public class Cat extends Animal{

    static void happiness(String animal){
        System.out.println("Overwrite this func:\n\t\t"+animal+" is happiness now...");
    }
    public static void main(String[] args){
        System.out.println("Cat extends Animal...");
	barking("cat");
	hungry("cat");
	sleeping("cat");
	happiness("cat");
    }
}
