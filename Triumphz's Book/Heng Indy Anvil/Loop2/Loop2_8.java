public class Loop2_8 {
    public static void main(String[] args) {
        System.out.println("===== EIGHT =====");
        System.out.format("พิมพ์%n----------1%n---------123%n--------54321%n-------1234567%n------987654321 10 บรรทัด%n");
        int int_x = 1;
        for(int int_max=10,i=int_max; i>=1; i--){
            for(int l=1; l<=i; l++){
                System.out.format("%3s", "-");
            }
            if (i % 2 == 0) {
                for(int x=int_x; x>=1; x--){
                    System.out.format("%3d",x);
                }
            } else {
                for(int x=1; x<=int_x; x++){
                    System.out.format("%3d",x);
                } 
            }
            int_x+=2;
            System.out.format("%n");
        }
    }
}