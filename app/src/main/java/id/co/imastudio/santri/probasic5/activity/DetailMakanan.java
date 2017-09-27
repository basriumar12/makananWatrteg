package id.co.imastudio.santri.probasic5.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.co.imastudio.santri.probasic5.R;
import id.co.imastudio.santri.probasic5.helper.MyConstant;
import id.co.imastudio.santri.probasic5.helper.MyFunction;

public class DetailMakanan extends MyFunction {

    @BindView(R.id.imgmakanan)
    ImageView imgmakanan;
    @BindView(R.id.txtnama)
    TextView txtnama;
    @BindView(R.id.txtharga)
    TextView txtharga;
    @BindView(R.id.txtstatus)
    TextView txtstatus;
    @BindView(R.id.txtdetail)
    TextView txtdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        ButterKnife.bind(this);
        //mengambil data dari intent
        Intent terima = getIntent();
        txtnama.setText(terima.getStringExtra("nm"));
        txtharga.setText(terima.getStringExtra("hr"));
        txtharga.setText(terima.getStringExtra("st"));
        txtdetail.setText(terima.getStringExtra("i"));
        Picasso.with(con).load(MyConstant.IMAGE_URL+terima.getStringExtra("gb")).
                error(R.drawable.img).into(imgmakanan);



    }
}
