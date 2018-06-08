import java.util.*;

public class Exercise1_7 {
    public static void main(String[] args) {
        System.out.println("===== SEVEN =====");
        System.out.println("จงเขียนโปรแกรมที่รับข้อมูลเป็นตัวเลขชนิดทศนิยม 3 ตัว เข้าทางคีย์บอร์ดแล้วทำการหาผลรวมและค่าเฉลี่ยของตัวเลขเหล่านั้น โดยแสดงผลลัพธ์ออกทางจอภาพ");
        System.out.print("Enter three number : ");
        Scanner sc = new Scanner(System.in); 
        double[] arr_num = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};
        double dbl_sum =  Arrays.stream(arr_num).sum();
        double dbl_avg =  Arrays.stream(arr_num).average().getAsDouble();
        System.out.format("SUM : %.4f%n", dbl_sum);
        System.out.format("AVG : %.4f", dbl_avg);
    }
}