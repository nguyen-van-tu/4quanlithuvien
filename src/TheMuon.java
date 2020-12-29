public class TheMuon {
    private int idCard;
    private int dateBorow;
    private int datePay;
    private SinhVien sinhVien;
    private String nameBook;

    public TheMuon() {
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public void setDateBorow(int dateBorow) {
        this.dateBorow = dateBorow;
    }

    public int getDatePay() {
        return datePay;
    }

    public void setDatePay(int datePay) {
        this.datePay = datePay;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "idCard=" + idCard +
                ", dateBorow=" + dateBorow +
                ", datePay=" + datePay +
                ", sinhVien=" + sinhVien +
                ", idBook=" + nameBook +
                '}';
    }
}
