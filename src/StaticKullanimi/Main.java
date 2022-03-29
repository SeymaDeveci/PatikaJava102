package StaticKullanimi;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Mustafa","1");
        System.out.println(p1.name);
        p1.login();

        Player p2 = new Player("Fatma", "2");
        System.out.println(p2.name);
        p2.login();

        Player p3 = new Player("Ayşe", "3");
        System.out.println(p3.name);
        p3.login();

        Player.show();

        System.out.println(Player.count);

        Course mat = new Course("Matematik","MAT-101", 70);
        Course fizik = new Course("Fizik","FZK-101", 35);
        Course kimya = new Course("Kİmya","KİM-101", 90);

        int[] notlar = {mat.note, fizik.note, kimya.note};

        Course.calcAvarage(notlar);
    }
}
