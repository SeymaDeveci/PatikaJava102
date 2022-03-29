package StaticKullanimi;

public class Player {
    public String name; //Başında static olmayan değişken olgu değişkenidir. Nesneye aittir. Nesne ile çağrılır.
    public String id; //Başında static olmayan değişken olgu değişkenidir. Nesneye aittir. Nesne ile çağrılır.
    public static String game = "GS"; //Hafızada otomatik üretilir ve nesne oluşturulmasa da hafızada yer kaplar. Nesne üzerinden değil sınıf üzerinden çağrılır. Sınıfa aittir.
    public static int count = 0; //Hafızada otomatik üretilir ve nesne oluşturulmasa da hafızada yer kaplar. Nesne üzerinden değil sınıf üzerinden çağrılır. Sınıfa aittir.
    public static int number = 22;

    public Player(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void login(){
        count++;
    }

    public static void show(){
        System.out.println(Player.number);
    }
}
