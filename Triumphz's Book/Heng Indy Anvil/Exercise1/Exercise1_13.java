import java.util.*;

public class Exercise1_13 {
    public static void main(String[] args) {
        System.out.println("===== THIRTEEN =====");
        System.out.println("เราสามารถประมาณค่าของ n! ได้ด้วยสูตร Stirling' s approximation ดังต่อไปนี้");
        System.out.println("n! = √(2πn)*((n/e) ยกกำลัง n)");
        Scanner sc = new Scanner(System.in); 
        double dbl_n =  sc.nextDouble();
        double dbl_answer = Math.sqrt(2 * Math.PI * dbl_n) * Math.pow((dbl_n / Math.E), dbl_n);
        System.out.format("n! = √(2 %.4f %.4f)*((%.4f / %.4f) ยกกำลัง %.4f)%n", Math.PI, dbl_n, dbl_n, Math.E, dbl_n);
        System.out.println("n! : " + dbl_answer);
    }
}