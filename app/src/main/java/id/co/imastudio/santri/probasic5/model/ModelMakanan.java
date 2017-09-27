
package id.co.imastudio.santri.probasic5.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelMakanan {

    @SerializedName("makanan")
    @Expose
    private List<Makanan> makanan = null;
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("sukses")
    @Expose
    private String sukses;

    public List<Makanan> getMakanan() {
        return makanan;
    }

    public void setMakanan(List<Makanan> makanan) {
        this.makanan = makanan;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getSukses() {
        return sukses;
    }

    public void setSukses(String sukses) {
        this.sukses = sukses;
    }

}
