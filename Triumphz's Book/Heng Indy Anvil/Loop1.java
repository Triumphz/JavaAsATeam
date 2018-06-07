public class Loop1 {
    public static void main(String[] args) {
        System.out.println("Loop1");
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
    }

    private static void one(){
        System.out.println("===== ONE =====");
        for(int i= 1; i<=100; i++){
            System.out.println(i);
        }
    }

    private static void two(){
        System.out.println("===== TWO =====");
        for(int i= 100; i>0; i--){
            System.out.println(i);
        }
    }

    private static void three(){
        System.out.println("===== THREE =====");
        for(int i= 1; i<=100; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void four(){
        System.out.println("===== FOUR =====");
        for(int i= 1; i<=100; i++){
            //if(i == 1 || i % 3 == 0) {
            if(!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

    private static void five(){
        System.out.println("===== FIVE =====");
        for(int i= 1; i<=100; i++){
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void six(){
        System.out.println("===== SIX =====");
        for(int i= 1; i<=100; i++){
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void seven(){
        System.out.println("===== SEVEN =====");
        for(int i= 1; i<=100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void eight(){
        System.out.println("===== EIGHT =====");
        for(int i= 1; i<=100; i++){
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void nine(){
        System.out.println("===== NINE =====");
        for(int i= 1; i<=100; i++){
            if(((i%3== 0?1:0)+(i%5==0?1:0))==1)  {
                System.out.println(i);
            }
        }
    }

    private static void ten(){
        System.out.println("===== TEN =====");
        for(int i= 1; i<=1000; i++){
            if(((i%3== 0?1:0)+(i%5==0?1:0)+(i%7==0?1:0))==2) {
                System.out.println(i);
            }
        }
    }
}