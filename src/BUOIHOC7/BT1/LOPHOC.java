package BUOIHOC7.BT1;

import java.util.ArrayList;

public class LOPHOC {
    private String malop, tenlop;
    private ArrayList<HOCSINH> dsHocSinh = new ArrayList<HOCSINH>();

    public LOPHOC(String malop, String tenlop) {
        this.malop = malop;
        this.tenlop = tenlop;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public ArrayList<HOCSINH> getDsHocSinh() {
        return dsHocSinh;
    }

    public void setDsHocSinh(ArrayList<HOCSINH> dsHocSinh) {
        this.dsHocSinh = dsHocSinh;
    }

    // hàm thêm mới học sinh
    public void themmoilophoc(HOCSINH hs) {
        dsHocSinh.add(hs);
    }

    public void hienthidanhsachHocSinh() {
        if (dsHocSinh.size() == 0) {
            System.out.println("không có học sinh trong lớp " + tenlop);
            return;
        }
        System.out.println("Danh sách học sinh của lớp : " + tenlop + ":");
        for (HOCSINH hs : dsHocSinh) {
            hs.hienThiThongTin();
        }
    }

    public HOCSINH timhocsinhtheomasv(String maSV) {
        for (HOCSINH hs : dsHocSinh) {
            if (hs.getMaSV().equals(maSV)) {
                return hs;
            }
        }
        return null;
    }

}
