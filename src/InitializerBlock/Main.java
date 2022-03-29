package InitializerBlock;
import java.util.Scanner;
// Java Static Initializer Block
public class Main {

    static Scanner inp = new Scanner(System.in);
    static int B = inp.nextInt();
    static int H = inp.nextInt();
    static boolean flag = true;
    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception error) {
            System.out.println(error);
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }
}
