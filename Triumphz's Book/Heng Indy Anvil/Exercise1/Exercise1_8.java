public class Exercise1_8 {
    public static void main(String[] args) {
        System.out.println("===== EIGHT =====");
        System.out.println("โจทย์การคำนวณอายุ (Age Calculation) จงเขียนโปรแกรมสำหรับตำนวณอายุของพ่อและลุง โดยไม่มีการรับ input ทั้งนี้กำหนดให้พ่อและลุงมีอายุรวมกัน 109 ปี และลุงอายุมากกว่าพ่อ อยู่ 5 ปี ให้หาว่าพ่อและลุงอายุเท่าไร");
        boolean bln_success = false;
        for (int f=1; bln_success==false; f++){
            for (int u=f+5; u<109; u++){
                if ((f+u==109) && (u-f==5)){
                    bln_success = true;
                    System.out.format("Father : %d%n", f);
                    System.out.format("Uncle : %d%n", u);
                    break;
                }
            }
        }
    }
}