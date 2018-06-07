public class Loop1_3 {
    public static void main(String[] args) {
        System.out.println("===== THREE =====");
        System.out.println("พิมพ์ 1 ถึง 100 เฉพาะเลขคู่");
        for(int i= 1; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}