import java.util.*;

public class Exercise1_10 {
    public static void main(String[] args) {
        System.out.println("===== TEN =====");
        System.out.println("ความวัดความเร็วที่ตำรวจทางหลวงใช้อาศัยยิงคลื่นความถี่ f0 ไปกระทบกับตัวรถที่เคลื่อนเข้าหาแล้วรอรับคลื่นสะท้อนกลับมา f1 เพื่อนำไปตำนวณความเร็วรถด้วยสูตร");
        System.out.println("V = (10.7585 x (10 ยกกำลัง 8) x ((f1 - f0) / (f1 + f0)) กิโลเมตรต่อชั่วโมง โดยที่ f0 = 2 x (10 ยกกำลัง 10) วินาที");
        System.out.println("จงเขียนโปรแกรมรับความถี่ f1 เพื่อแสดงความเร็วรถ (ลองให้ f1 = 2.000001 x (10 ยกกำลัง 10)(วินาที ยกกำลัง -1) ดู) หมายเหตุ : เราสามารถเขียนค่าคงตัวของจำนวนจริงในรูปแบบสัญกรณ์ทางวิทยาศาสตร์ได้ในจาวา เช่น -2.03x(10 ยกกำลัง 11) เขียนแทนด้วย -2.03e11 โดยสามารถป้อนการเขียนอย่างสั้นนี้ผ่านแป้นพิมพ์ก็ได้");
        Scanner sc = new Scanner(System.in); 
        double dbl_f0 = 2e10;
        System.out.print("Enter f1 : ");
        double dbl_f1 =  sc.nextDouble();
        System.out.format("V : %.4f x ((%.4f - %.4f) / (%.4f + %.4f))", 10.7585e8, dbl_f1, dbl_f0, dbl_f1, dbl_f0);
        System.out.format("V : %.4f", 10.7585e8 * ((dbl_f1 - dbl_f0) / (dbl_f1 + dbl_f0)));
    }
}