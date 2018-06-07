public class Loop1_8 {
    public static void main(String[] args) {
        System.out.println("===== EIGHT =====");
        System.out.println("พิมพ์ 1 ถึง 100 เฉพาะเลขที่หาร 3 หรือ 5 ลงตัว");
        for(int i= 1; i<=100; i++){
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}