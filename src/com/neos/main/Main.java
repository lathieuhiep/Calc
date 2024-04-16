package com.neos.main;

import com.neos.phanso.PhanSo;
import com.neos.pheptinh.PhepTinh;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(3, 4);

        PhepTinh pt = new PhepTinh(ps1, ps2);
        pt.tinhTong();
        pt.tinhHieu();

        // Thay đổi giá trị mẫu số của phân số thứ 2 và tính lại tổng, hiệu
        System.out.println();
        System.out.println("Thay đổi giá trị mẫu số của phân số thứ 2");
        ps2 = new PhanSo(3, 5);
        pt = new PhepTinh(ps1, ps2);
        pt.tinhTong();
        pt.tinhHieu();
    }
}