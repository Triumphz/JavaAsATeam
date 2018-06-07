public class Loop1_6 {
    public static void main(String[] args) {
        System.out.println("===== SIX =====");
        System.out.println("พิมพ์ 1 ถึง 100 เฉพาะเลขที่หาร 5 ลงตัว");
        for(int i= 1; i<=100; i++){
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}