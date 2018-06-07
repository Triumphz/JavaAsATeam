import java.util.*;

public class Exercise1_2 {
    public static void main(String[] args) {
        System.out.println("===== TWO =====");
        System.out.println("เขียนโปรแกรมเพื่อคำนวณหาพื้นที่วงกลม โดนให้รับ input เป็น รัศมีของวงกลม จากสูตรต่อไปนี้");
        System.out.println("พื้นที่วงกลม = π * (รัศมี ยกกำลัง2)");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Radius : ");
        float flt_radius = sc.nextFloat();
        System.out.format("Area : %.4f * (%.4f * %.4f)%n", Math.PI, flt_radius, flt_radius);
        System.out.format("Area : %.4f", (Math.PI * (flt_radius * flt_radius)));
    }
}