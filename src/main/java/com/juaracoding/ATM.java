package com.juaracoding;

public class ATM {
    private double saldo;

    public ATM(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public double lihatSaldo() {
        return saldo;
    }

    public void setorUang(double jumlah) {
        if (jumlah > 0) { // Memeriksa apakah jumlah yang disetor valid atau (lebih besar dari 0)
            saldo += jumlah; // Menambah saldo dengan jumlah yang disetor
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }

    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) { // Memeriksa apakah jumlah yang ditarik valid dan tidak melebihi saldo
            saldo -= jumlah; // Mengurangi saldo dengan jumlah yang ditarik
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
}