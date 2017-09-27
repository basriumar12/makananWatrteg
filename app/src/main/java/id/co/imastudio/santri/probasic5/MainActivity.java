package id.co.imastudio.santri.probasic5;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.imastudio.santri.probasic5.adapter.RecycerViewAdapter;
import id.co.imastudio.santri.probasic5.helper.MyConstant;
import id.co.imastudio.santri.probasic5.helper.MyFunction;
import id.co.imastudio.santri.probasic5.model.Makanan;
import id.co.imastudio.santri.probasic5.model.ModelMakanan;
import id.co.imastudio.santri.probasic5.network.RestAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends MyFunction {

    @BindView(R.id.listmakanan)
    RecyclerView listmakanan;
    RecyclerView.LayoutManager layoutManager;
    //membuat variabel datamakan menggunakn List (untuk menampung data)
    List<Makanan> datamakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //ambil dari MyFunction layoutnya
        layoutManager = new LinearLayoutManager(con);
        //id dari recylerfivew
        listmakanan.setLayoutManager(layoutManager);

        //method menampilkan data
        getDatamakanan();
    }

    private void getDatamakanan() {
        final ProgressDialog loading = ProgressDialog.show(con,"prosses Get data makanan",
                "harap bersabar");
        //inisialisasi retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL) //ke url java MyCOnstant
                .addConverterFactory(GsonConverterFactory.create())//diconvert
                .build();//dibuild

        RestAPI api = retrofit.create(RestAPI.class);
        //ngecal
        Call<ModelMakanan> modelMakananCall = api.getMakanan();
        //panggil metho enquee untuk merespon pemanggilan data
        modelMakananCall.enqueue(new Callback<ModelMakanan>() {
            @Override
            public void onResponse(Call<ModelMakanan> call, Response<ModelMakanan> response) {
                String pesan =  response.body().getPesan();
                String sukses = response.body().getSukses();

                if (sukses.equals("true")){
                    pesan(pesan);
                    loading.dismiss();

                    datamakanan =  response.body().getMakanan();
                    //showdata makanan
                    tampildatamakanan();
                } else {
                    pesan(pesan);
                }
            }

            @Override
            public void onFailure(Call<ModelMakanan> call, Throwable t) {

            }
        });

    }

    private void tampildatamakanan() {
        String items []= new String[datamakanan.size()];
        for (int i=0;i<datamakanan.size();i++){
            items[i]=datamakanan.get(i).getNama1();
        }

        RecycerViewAdapter adapter = new RecycerViewAdapter(con, datamakanan);
        listmakanan.setAdapter(adapter);
    }


}
