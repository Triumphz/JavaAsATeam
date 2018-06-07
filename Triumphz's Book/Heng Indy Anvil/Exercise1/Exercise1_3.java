import java.util.*;

public class Exercise1_3 {
    public static void main(String[] args) {
        System.out.println("===== THREE =====");
        System.out.println("เขียนโปรแกรมเพื่อคำนวณหารัศมีของวงกลม โดยให้รับ input เป็น พื้นที่วงกลม โดยใช้สูตรเดียวกับข้อ 2");
        System.out.println("พื้นที่วงกลม = π * (รัศมี ยกกำลัง2)");
        System.out.println("รัศมี = √(พื้นที่วงกลม / π)");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Arae : ");
        float flt_area = sc.nextFloat();
        System.out.format("Radius : √(%.4f / %.4f)%n", flt_radius, Math.PI);
        System.out.format("Radius : %.4f", (Math.sqrt(flt_area / Math.PI)));
    }
}