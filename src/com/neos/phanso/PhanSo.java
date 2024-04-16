package com.neos.phanso;

public class PhanSo {
    private int tu, mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void in() {
        System.out.println(tu + "/" + mau);
    }

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    // tim UCLN
    private int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        }

        return timUCLN(b, a % b);
    }

    public void toiGian() {
        int ucln = timUCLN(tu, mau);

        tu = tu / ucln;
        mau = mau / ucln;

        System.out.println("Phân số tối giản: " + tu + "/" + mau);
    }
}
