import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SinhVien student = new SinhVien();
        Method method = new Method();
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("1: Thêm thẻ mượn");
            System.out.println("2: Hiển thị thẻ mượn");
            System.out.println("3: Trả sách");
            System.out.println("0: Exit");
            input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 1:
                    method.addStudent();
                    break;
                case 2:
                    method.showStudent();
                    break;
                case 3:
                    do {
                        System.out.println("Nhập ngày sách trả:");
                        int a = Integer.parseInt(sc.nextLine());
                        method.searchDatePay(a);
                    }while (method == null);
            }
        } while (input != 0);


    }
}
