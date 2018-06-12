import java.util.*;

public class Exercise1_15 {
    public static void main(String[] args) {
        System.out.println("===== FIFTEEN =====");
        System.out.println("จงเขียนโปรแกรมที่รับน้ำหนักและความสูง เพื่อแสดงพื้นที่ของผิวกายด้วยสูตรทั้งสามข้างล่างนี้ น้ำหนัก w มีหน่วยเป็นกิโลกรัมและความสูง h มีหน่วยเป็นเซนติเมตร ผลที่ได้มีหน่วยเป็นตารางเมตร (ให้เขียนการคำนวณทั้งสามสูตรใรคลาสเดียวกัน)");
        System.out.println("สูตรของ Mosteller S = √((w x h) / 3600");
        System.out.println("สูตรของ Dubois S = (71.84 x (w ยกกำลัง 0.425) x (h ยกกำลัง 0.725)) / 10000");
        System.out.println("สูตรของ Boyd S = 0.0003207 x (h ยกกำลัง 0.3) x ((1000 x w) ยกกำลัง 0.7285 - 0.0188(3 + log10w))");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter width : ");
        float flt_width =  sc.nextFloat();
        System.out.print("Enter height : ");
        float flt_height =  sc.nextFloat();
        System.out.format("Mosteller : %.4f%n", (Math.sqrt((flt_width * flt_height) / 3600)));
        System.out.format("Dubois : %.4f%n", ((71.84 * Math.pow(flt_width,0.425) * Math.pow(flt_height, 0.725)) / 10000));
        System.out.format("Boyd : %.4f", (0.0003207 * Math.pow(flt_height,0.3) * Math.pow((1000 * flt_width) , 0.7285 - 0.0188 * (3 + Math.log10(flt_width)))));
    }
}