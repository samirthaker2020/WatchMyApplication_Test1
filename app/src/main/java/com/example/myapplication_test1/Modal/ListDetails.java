package com.example.myapplication_test1.Modal;

public class ListDetails {

    String DialogHeader;
    int dno;

    public ListDetails(String dialogHeader, int dno) {
        DialogHeader = dialogHeader;
        this.dno = dno;
    }

    public String getDialogHeader() {
        return DialogHeader;
    }

    public void setDialogHeader(String dialogHeader) {
        DialogHeader = dialogHeader;
    }

    public int getDno() {
        return dno;
    }

    @Override
    public String toString() {
        return "ListDetails{" +
                "DialogHeader='" + DialogHeader + '\'' +
                ", dno=" + dno +
                '}';
    }

    public void setDno(int dno) {
        this.dno = dno;
    }
}
