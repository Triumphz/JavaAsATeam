import java.util.*;

public class Exercise1_16 {
    public static void main(String[] args) {
        System.out.println("===== SIXTEEN =====");
        System.out.println("จงเขียนโปรแกรมรับตัวเลขเป็นจำนวนหน่วยวินาทีจากแป้นพิมพ์ จากนั้นให้คำนวณว่าวินาทีที่รับเข้ามาเป็นจำนวนปี เดือน วัน ชั่วโมง นาที และวินาทีอย่างละเท่าไร (เพื่อความง่ายให้ประมาณว่า 1 เดือน มี 30 วัน) เช่น");
        System.out.println("1000000 วินาที = 0 ปี 0 เดือน 11 วัน 13 ชั่วโมง 46 นาที 40 วินาที");
        System.out.println("60 วินาที = 1 นาที");
        System.out.println("3600 วินาที = 1 ชั่วโมง");
        System.out.println("86400 วินาที = 1 วัน");
        System.out.println("2592000 วินาที = 1 เดือน");
        System.out.println("946080000 วินาที = 1 ปี");
        Scanner sc = new Scanner(System.in); 
        System.out.print("วินาที : ");
        int int_second = sc.nextInt();
        int int_second_max = int_second;
        int[] arr_time = {0, 0, 0, 0, 0, 0};
        arr_time[0] = int_second / 946080000;
        int_second-=(946080000 * arr_time[0]);
        arr_time[1] = int_second / 2592000;
        int_second-=(2592000 * arr_time[1]);
        arr_time[2] = int_second / 86400;
        int_second-=(86400 * arr_time[2]);
        arr_time[3] = int_second / 3600;
        int_second-=(3600 * arr_time[3]);
        arr_time[4] = int_second / 60;
        int_second-=(60 * arr_time[4]);
        arr_time[5] = int_second;
        System.out.format("%d วินาที = %d ปี %d เดือน %d วัน %d ชั่วโมง %d นาที %d วินาที", int_second_max, arr_time[0], arr_time[1], arr_time[2], arr_time[3], arr_time[4], arr_time[5]);
    }
}