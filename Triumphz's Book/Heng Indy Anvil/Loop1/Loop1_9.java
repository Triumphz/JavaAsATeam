public class Loop1_9 {
    public static void main(String[] args) {
        System.out.println("===== NINE =====");
        System.out.println("พิมพ์ 1 ถึง 100 เฉพาะเลขที่หาร 3, 5 ลงตัว เพียงตัวเดียวเท่านั้น ถ้าหารลงตัวทั้งสองตัวไม่ต้องพิมพ์");
        for(int i= 1; i<=100; i++){
            int int_round = (i%3== 0?1:0)+(i%5==0?1:0);
            if(int_round == 1){
                System.out.println(i);
            }
        }
    }
}