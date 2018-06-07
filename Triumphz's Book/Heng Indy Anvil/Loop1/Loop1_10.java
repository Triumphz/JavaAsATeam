public class Loop1_9 {
    public static void main(String[] args) {
        System.out.println("===== TEN =====");
        System.out.println("พิมพ์ 1 ถึง 1000 เฉพาะเลขที่หาร 3, 5, 7 ลงตัว เป็นคู่ ๆ หารลงตัวทั้ง 3 ตัว หารลงตัวเดียวไม่ต้อง เช่น");
        System.out.println("3, 5     5, 7     7, 3");
        for(int i= 1; i<=1000; i++){
            int int_round = (i%3== 0?1:0)+(i%5==0?1:0)+(i%7==0?1:0);
            if(int_round==2) {
                System.out.println(i);
            }
        }
    }
}