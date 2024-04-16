package com.neos.pheptinh;

import com.neos.phanso.PhanSo;

public class PhepTinh {
    private PhanSo ps1, ps2;

    public PhepTinh(PhanSo ps1, PhanSo ps2) {
        this.ps1 = ps1;
        this.ps2 = ps2;
    }

    // tinh tong
    public void tinhTong() {
        int tuSoTong = this.ps1.getTu() * this.ps2.getMau() + this.ps2.getTu() * this.ps1.getMau();
        int mauSoTong = this.ps1.getMau() * this.ps2.getMau();

        PhanSo tong = new PhanSo(tuSoTong, mauSoTong);

        System.out.println("Tổng: " + tuSoTong + "/" + mauSoTong);
        tong.toiGian();
    }

    public void tinhHieu() {
        int tuSoHieu = this.ps1.getTu() * this.ps2.getMau() - this.ps2.getTu() * this.ps1.getMau();
        int mauSoHieu = this.ps1.getMau() * this.ps2.getMau();

        PhanSo hieu = new PhanSo(tuSoHieu, mauSoHieu);
        System.out.println("Hiệu " + tuSoHieu + "/" + mauSoHieu);
        hieu.toiGian();
    }
}
