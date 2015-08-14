public class Dog extends Animal{

    static void jumping(){
        System.out.println("Dog is jumping...");
    }

    public static void main(String[] args){
        System.out.println("Dog extends Animal...");
        barking("Dog");
	hungry("Dog");
	sleeping("Dog");
	jumping();
    }
}
