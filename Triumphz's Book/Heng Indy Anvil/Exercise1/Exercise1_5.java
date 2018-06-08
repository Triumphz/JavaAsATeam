import java.util.*;

public class Exercise1_5 {
    public static void main(String[] args) {
        System.out.println("===== FIVE =====");
        System.out.println("จงเขียนโปรแกรมรับข้อมูลเป็นองศาเซลเซียส (Celsius) เข้าทางคีย์บอร์ด แล้วทำการแปลงให้เป็นองศาฟาเรนไฮต์ (Fahrenheit) จากสูคร");
        System.out.println("Celsius = (5 / 9) * (Fahrenheit - 32)");
        System.out.println("Fahrenheit = (Celsius / (5 / 9)) + 32");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Celsius : ");
        float flt_celsius = sc.nextFloat();
        System.out.format("Fahrenheit : (%.4f / (5 / 9)) + 32%n", flt_celsius);
        System.out.format("Fahrenheit : %.4f", ((flt_celsius / (5.0 / 9)) + 32));
    }
}