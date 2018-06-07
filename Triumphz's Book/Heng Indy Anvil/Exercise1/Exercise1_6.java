import java.util.*;

public class Exercise1_6 {
    public static void main(String[] args) {
        System.out.println("===== SIX =====");
        System.out.println("จงเขียนโปรแกรมที่รับข้อมูลเป็นตัวเลขชนิดจำนวนเต็ม 3 ตัว เข้าทางคีย์บอร์ดแล้วทำการหาผลรวมและค่าเฉลี่ยของตัวเลขเหล่านั้น โดยแสดงผลลัพธ์ออกทางจอภาพ");
        System.out.print("Enter three number : ");
        int[] arr_num = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int int_sum =  Arrays.stream(arr_num).sum();
        double dbl_avg =  Arrays.stream(arr_num).average().getAsDouble();
        System.out.format("SUM : %d%n", int_sum);
        System.out.format("AVG : %.4f", dbl_avg);
    }
}