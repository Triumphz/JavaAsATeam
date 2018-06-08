public class Exercise1_12 {
    public static void main(String[] args) {
        System.out.println("===== TWELVE =====");
        System.out.println("จงหาว่าเมื่อทุกคำสั่งข้างล่างนี้ทำงานเสร็จแล้วตัวแปรต่าง ๆ a, b, c, x, y, z จะเก็บค่าอะไรบ้าง");
        System.out.println("int a = 0, b = 1, c = 2;");
        System.out.println("double x = 0, y = 1, z = 2;");
        System.out.println("x = a-- + ++b + c++ + ++y / z++;");
        int a = 0, b = 1, c = 2;
        double x = 0, y = 1, z = 2;
        x = a-- + ++b + c++ + ++y / z++;
        System.out.format("a : %d%n", a);
        System.out.format("b : %d%n", b);
        System.out.format("c : %d%n", c);
        System.out.format("x : %.4f%n", x);
        System.out.format("y : %.4f%n", y);
        System.out.format("z : %.4f", z);
    }
}