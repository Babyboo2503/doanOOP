package DH;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author compu
 */
public class HOADON {
    String maHD,TenSP,maSP,SDT,maNV;
    int SL;
    double donGia, thanhTien;
    SimpleDateFormat ft=new SimpleDateFormat("dd-MM-yyyy");
    Date date=new Date();
    String ngayTaoHD=ft.format(date);
    
    Scanner input=new Scanner(System.in); 
    DecimalFormat format = new DecimalFormat();

    public HOADON() {
    }

    public HOADON(String maHD,String MaNV, String SDT,String ngayTaoHD, String maSP, String TenSP, int SL, double donGia, double thanhTien) {
        this.maHD = maHD;
        this.maNV=MaNV;
        this.SDT = SDT;
        this.ngayTaoHD=ngayTaoHD;
        this.TenSP = TenSP;
        this.maSP = maSP;
        this.SL = SL;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }



    public void NHAP(){
        System.out.print("Ma san pham: ");
        maSP=input.nextLine();
        System.out.print("So luong: ");
        SL=input.nextInt();
        System.out.print("Don gia:");
        donGia=input.nextDouble();
        thanhTien=donGia*SL;
        System.out.println("Thanh tien:"+format.format(thanhTien));
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayTaoHD() {
        return ngayTaoHD;
    }

    public void setNgayTaoHD(String ngayTaoHD) {
        this.ngayTaoHD = ngayTaoHD;
    }

    @Override
    public String toString() {
        return maHD + "/" + maNV + "/" + SDT + "/" + ngayTaoHD + "/" + TenSP + "/" + maSP + "/" +SL+"/"+ donGia + "/" + thanhTien;
    }
    
    
 
    

    
    public void XUAT_KTV(HOADON A){
        System.out.println("-------------------------------HOADON------------------------------------\n");
        System.out.println("Ma don: "+getMaHD());
        System.out.println("N.Vien: "+getMaNV());
        System.out.println("                                                        KH: "+getSDT());
        System.out.println("                                                  Ngay tao: "+getNgayTaoHD());
        System.out.printf("%6s%15s%15s%15s\n","Ma san pham","Ten san pham","So luong","Gia tien");
        System.out.printf("%6s%15s%15s%15s\n",getMaSP(),getTenSP(),getSL(),getDonGia());
//        System.out.println("          Ma san pham           Gia tien              So luong         ");
//        for(THONGTINSANPHAM t : ttsp){
//        System.out.printf("%15d%15d%17.3f VND\n",t.masp,t.soluong,t.price);
//        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("TONG TIEN : %35.3f VND",thanhTien);
        System.out.println("                                                       TONG TIEN = "+thanhTien+"VND");        
    }
    public void XUAT(HOADON A){
        System.out.println("-------------------------------HOADON------------------------------------\n");
        System.out.println("Ma don: "+getMaHD());
        System.out.println("N.Vien: "+getMaNV());
        System.out.println("                                                  Ngay tao: "+getNgayTaoHD());
        System.out.printf("%6s%15s%15s%15s\n","Ma san pham","Ten san pham","So luong","Gia tien");
        System.out.printf("%6s%15s%15s%15s\n",getMaSP(),getTenSP(),getSL(),getDonGia());
//        System.out.println("          Ma san pham           Gia tien              So luong         ");
//        for(THONGTINSANPHAM t : ttsp){
//        System.out.printf("%15d%15d%17.3f VND\n",t.masp,t.soluong,t.price);
//        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("TONG TIEN : %35.3f VND",thanhTien);
        System.out.println("                                                       TONG TIEN = "+thanhTien+"VND");        
    }
}