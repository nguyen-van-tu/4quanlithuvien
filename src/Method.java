import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    Scanner sc = new Scanner(System.in);
    TheMuon theMuon = new TheMuon();
    SinhVien sinhVien = new SinhVien();
    ArrayList<SinhVien> sinhViensList = new ArrayList<>();
    ArrayList<TheMuon> theMuonList = new ArrayList<>();

    public void addStudent() {
        System.out.println("Nhâp tên");
        sinhVien.setName(sc.nextLine());
        System.out.println("Nhập id");
        sinhVien.setIdStudent(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập ngày sinh");
        sinhVien.setDateOfBirth(sc.nextLine());
        System.out.println("Nhập lớp");
        sinhVien.setClasss(sc.nextLine());
        System.out.println("Nhập mã thẻ");
        theMuon.setIdCard(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập ngày mượn");
        theMuon.setDateBorow(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập ngày trả");
        theMuon.setDatePay(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tên sách mượn");
        theMuon.setNameBook(sc.nextLine());
        sinhViensList.add(sinhVien);
        theMuonList.add(theMuon);

    }

    public void showStudent() {
        for (SinhVien s : sinhViensList) {
            System.out.println(s.toString());
        }
        for (TheMuon t : theMuonList) {
            System.out.println(t.toString());
        }
    }

    public void searchDatePay(int datePay){
        for (TheMuon t : theMuonList) {
            if (datePay == (t.getDatePay())){
                System.out.println("Sách cần trả là: " + theMuon.getNameBook());
            }
        }
    }
}
