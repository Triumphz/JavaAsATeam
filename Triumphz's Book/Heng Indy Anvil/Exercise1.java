import java.util.*;

public class Exercise1 {
    private static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Exercise1");
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

    private static void one (){
        System.out.println("===== ONE =====");
        int int_num1 = 62;
        int int_num2 = 99;
        int int_total = int_num1+int_num2;
        System.out.println("Total :" + int_total);
    }

    private static void two(){
        System.out.println("===== TWO =====");
        System.out.print("Enter number : ");
        float flt_num = sc.nextFloat();
        System.out.println("Area :" + (3.14 * (flt_num * flt_num)));
    }

    private static void three(){
        System.out.println("===== THREE =====");
        System.out.print("Enter Arae : ");
        float flt_area = sc.nextFloat();
        System.out.println("answer :" + (Math.sqrt(flt_area / 3.14)));
    }

    private static void four(){
        System.out.println("===== FOUR =====");
        System.out.print("Enter IN : ");
        float flt_num = sc.nextFloat();
        System.out.println("FT :" + (flt_num / 12));
        System.out.println("CM :" + (flt_num * 2.54));
        System.out.println("YD :" + (flt_num / 36));
    }

    private static void five(){
        System.out.println("===== FIVE =====");
        System.out.print("Enter Celsius : ");
        float flt_num = sc.nextFloat();
        System.out.println("Fahrenheit :" + (flt_num / (5/9.0) + 32));
    }

    private static void six(){
        System.out.println("===== SIX =====");
        System.out.print("Enter three number : ");
        int[] arr_num = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int int_sum =  Arrays.stream(arr_num).sum();
        double dbl_avg =  Arrays.stream(arr_num).average().getAsDouble();
        System.out.format("SUM : %d%n", int_sum);
        System.out.format("AVG : %f%n", dbl_avg);
    }

    private static void seven(){
        System.out.println("===== SEVEN =====");
        System.out.print("Enter three number : ");
        double[] arr_num = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};
        double dbl_sum =  Arrays.stream(arr_num).sum();
        double dbl_avg =  Arrays.stream(arr_num).average().getAsDouble();
        System.out.format("SUM : %f%n", dbl_sum);
        System.out.format("AVG : %f%n", dbl_avg);
    }

    private static void eight(){
        System.out.println("===== EIGHT =====");
        boolean bln_success = false;
        for (int f=1; bln_success==false; f++){
            for (int u=1; u<109; u++){
                if ((f+u==109) && (u-f==5)){
                    bln_success = true;
                    System.out.format("father : %d%n", f);
                    System.out.format("uncle : %d%n", u);
                    break;
                }
            }
        }
    }

    private static void nine(){
        System.out.println("===== NINE =====");
        System.out.print("Enter width : ");
        float flt_width =  sc.nextFloat();
        System.out.print("Enter high : ");
        float flt_high =  sc.nextFloat();
        System.out.format("Area : %f%n", flt_width * flt_high);
    }

    private static void ten(){
        System.out.println("===== TEN =====");
        double dbl_f0 = 2e10;
        System.out.print("Enter f1 : ");
        double dbl_f1 =  sc.nextDouble();
        System.out.format("v : %f%n", 10.7585e8 * ((dbl_f1-dbl_f0)/(dbl_f1+dbl_f0)));
    }
}