import java.util.*;

public class Exercise1_14 {
    public static void main(String[] args) {
        System.out.println("===== FOUTTEEN =====");
        System.out.println("จงเขียนโปรแกรมคำนวณเกรดเฉลี่ยของทั้งวิชา โดยนำผลรวมที่ได้มาหารด้วยจำนวนนักเรียนทั้งหมด ให้คำนวณจากสูตรต่อไปนี้");
        System.out.println("4 x (จำนวนนักเรียนที่ได้ A) + 3 x (จำนวนนักเรียนที่ได้ B) + 2 x (จำนวนนักเรียนที่ได้ C) + 1 x (จำนวนนักเรียนที่ได้ D) + 0 x (จำนวนนักเรียนที่ได้ F)");
        Scanner sc = new Scanner(System.in); 
        int[] arr_num = new int[5];
        System.out.print("จำนวนนักเรียนที่ได้ A : ");
        arr_num[0] = sc.nextInt();
        System.out.print("จำนวนนักเรียนที่ได้ B : ");
        arr_num[1] = sc.nextInt();
        System.out.print("จำนวนนักเรียนที่ได้ C : ");
        arr_num[2] = sc.nextInt();
        System.out.print("จำนวนนักเรียนที่ได้ D : ");
        arr_num[3] = sc.nextInt();
        System.out.print("จำนวนนักเรียนที่ได้ F : ");
        arr_num[4] = sc.nextInt();
        System.out.format("AVG = 4 x %d + 3 x %d + 2 x %d + 1 x %d + 0 x %d%n", arr_num[0], arr_num[1], arr_num[2], arr_num[3], arr_num[4]);
        System.out.format("AVG : %d,", (4*arr_num[0] + 3*arr_num[1] + 2*arr_num[2] + 1*arr_num[3] + 0*arr_num[4]));
    }
}