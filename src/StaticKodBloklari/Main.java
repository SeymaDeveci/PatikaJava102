package StaticKodBloklari;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Program başladı.");

        User u1 = new User("Seyma Deveci");
        User u2 = new User("Emine Deveci");
        User u3 = new User("Ugur Deveci");

        System.out.println("Counter son değer: " + User.counter);
        System.out.println("Program Bitti");
    }
}
