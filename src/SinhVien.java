public class SinhVien {
    private String name;
    private int idStudent;
    private String DateOfBirth;
    private String classs;

    public SinhVien() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", idStudent=" + idStudent +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }
}
