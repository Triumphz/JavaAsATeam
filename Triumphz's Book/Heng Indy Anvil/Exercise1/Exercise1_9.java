import java.util.*;

public class Exercise1_9 {
    public static void main(String[] args) {
        System.out.println("===== NINE =====");
        System.out.println("จงเขียนโปรแกรมคำนวณหาพื้นที่ และความยาวรอบรูปของสี่เหลี่ยมโดยรับ input เป็นความกว้างและความสูง");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter width : ");
        float flt_width =  sc.nextFloat();
        System.out.print("Enter high : ");
        float flt_high =  sc.nextFloat();
        System.out.format("Area : %.4f%n", flt_width * flt_high);
    }
}