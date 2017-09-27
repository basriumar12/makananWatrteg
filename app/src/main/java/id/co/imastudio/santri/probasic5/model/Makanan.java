
package id.co.imastudio.santri.probasic5.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Makanan {

    @SerializedName("id_makanan1")
    @Expose
    private String idMakanan1;
    @SerializedName("nama1")
    @Expose
    private String nama1;
    @SerializedName("detail1")
    @Expose
    private String detail1;
    @SerializedName("gambar1")
    @Expose
    private String gambar1;
    @SerializedName("harga1")
    @Expose
    private String harga1;
    @SerializedName("status1")
    @Expose
    private String status1;

    public String getIdMakanan1() {
        return idMakanan1;
    }

    public void setIdMakanan1(String idMakanan1) {
        this.idMakanan1 = idMakanan1;
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getGambar1() {
        return gambar1;
    }

    public void setGambar1(String gambar1) {
        this.gambar1 = gambar1;
    }

    public String getHarga1() {
        return harga1;
    }

    public void setHarga1(String harga1) {
        this.harga1 = harga1;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

}
