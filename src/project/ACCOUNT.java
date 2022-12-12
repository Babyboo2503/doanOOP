package project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class ACCOUNT {
    private String taikhoan;
    private String matkhau;
    private int id;
    
    ACCOUNT(){
    }
    
    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public ACCOUNT(String taikhoan, String matkhau, int id) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tai khoan :"+taikhoan+" Mat khau :"+matkhau+" ID : "+id;
    }
}