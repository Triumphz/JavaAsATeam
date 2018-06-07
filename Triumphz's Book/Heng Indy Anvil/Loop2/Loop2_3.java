public class Loop2_3 {
    public static void main(String[] args) {
        System.out.println("===== TWO =====");
        System.out.println("พิมพ์ XXXXXXXXXX 10 บรรทัด");
        for(int i=1; i<=10; i++){
            for(int l=1; l<=i; l++){
                System.out.print("X");
            }
            System.out.format("%n");
        }
    }
}