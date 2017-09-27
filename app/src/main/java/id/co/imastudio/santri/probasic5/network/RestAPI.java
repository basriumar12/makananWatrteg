package id.co.imastudio.santri.probasic5.network;

import id.co.imastudio.santri.probasic5.model.ModelMakanan;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Server on 18/08/2017.
 */

public interface RestAPI {
    //ngambil respon dari GSON
    @GET("getdatamakanan")
    Call<ModelMakanan> getMakanan();
}
