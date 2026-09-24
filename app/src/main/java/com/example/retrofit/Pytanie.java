package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Pytanie {
    @SerializedName("tresc")
    private String trescPytania;
    private String odp_a;
    private String odp_b;
    private String odp_c;
    private int poprawna;

    public Pytanie(String trescPytania, String odp_a, String odp_b, String odp_c, int poprawna) {
        this.trescPytania = trescPytania;
        this.odp_a = odp_a;
        this.odp_b = odp_b;
        this.odp_c = odp_c;
        this.poprawna = poprawna;
    }

    public String getTrescPytania() {
        return trescPytania;
    }

    public void setTrescPytania(String trescPytania) {
        this.trescPytania = trescPytania;
    }

    public String getOdp_a() {
        return odp_a;
    }

    public void setOdp_a(String odp_a) {
        this.odp_a = odp_a;
    }

    public String getOdp_b() {
        return odp_b;
    }

    public void setOdp_b(String odp_b) {
        this.odp_b = odp_b;
    }

    public String getOdp_c() {
        return odp_c;
    }

    public void setOdp_c(String odp_c) {
        this.odp_c = odp_c;
    }

    public int getPoprawna() {
        return poprawna;
    }

    public void setPoprawna(int poprawna) {
        this.poprawna = poprawna;
    }
}
