package FinalSabitTanimlama;

public class Daire {
    public int r;
    public final double PI_SAYISI = 3.14; // final olanı hiç bir yerde değiştiremeyiz.

    public Daire(int r) {
        this.r = r;
    }

    public void calcArea(){
        double area = PI_SAYISI * this.r * this.r;
        System.out.print("Dairenin alanı : " + area);
    }
}
