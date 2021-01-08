package com.company;

public class NoConnectionEx extends Exception {
    private int nrError;

    public void setNrError(int nrError) {
        this.nrError = nrError;
    }

    public int getNrError() {
        return nrError;
    }
}
