import java.util.*;

public class Exercise1_4 {
    public static void main(String[] args) {
        System.out.println("===== FOUR =====");
        System.out.println("จงเขียนโปรแกรมรับข้อมูลหน่วยวัดซึ่งมีหน่วยเป็นนิ้ว จากนั้นให้แปลงค่าจากนิ้ว (มใ้ทั้งหมดอยู่ในโปรเตคเดียวกัน)");
        System.out.println("แปลงนิ้วเป็นฟุต (1 ฟุต = 12 นิ้ว)");
        System.out.println("แปลงนิ้วเป็นเซนติเมตร (2.54 ซ.ม. = 1 นิ้ว)");
        System.out.println("แปลงนิ้วเป็นหลา (2.54 ซ.ม. = 36 นิ้ว)");
        System.out.print("Enter IN : ");
        float flt_num = sc.nextFloat();
        System.out.format("IN => FT : %.4f%n", (flt_num / 12));
        System.out.format("IN => CM : %.4f%n", (flt_num * 2.54));
        System.out.format("IN => YD : %.4f", (flt_num / 36));
    }
}