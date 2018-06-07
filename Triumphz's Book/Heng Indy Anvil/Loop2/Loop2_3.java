public class Loop2_3 {
    public static void main(String[] args) {
        System.out.println("===== THREE =====");
        System.out.println("พิมพ์ XXXXXXXXXX 10 บรรทัด");
        for(int i=10; i>=1; i--){
            for(int l=1; l<=i; l++){
                System.out.print("X");
            }
            System.out.format("%n");
        }
    }
}