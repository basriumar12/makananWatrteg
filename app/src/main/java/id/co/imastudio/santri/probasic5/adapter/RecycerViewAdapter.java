package id.co.imastudio.santri.probasic5.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.co.imastudio.santri.probasic5.R;
import id.co.imastudio.santri.probasic5.activity.DetailMakanan;
import id.co.imastudio.santri.probasic5.helper.MyConstant;
import id.co.imastudio.santri.probasic5.model.Makanan;

/**
 * Created by Server on 18/08/2017.
 */
//buat extendx seperti dibawah >

public class RecycerViewAdapter extends RecyclerView.Adapter<RecycerViewAdapter.MyViewHolder> {
   Context con;
    List<Makanan> data_makanan;
    Typeface gayahuruf;

    public RecycerViewAdapter(Context con, List<Makanan> datamakanan) {
        this.con =con;
        data_makanan=datamakanan;
    }

    @Override
    public RecycerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tampilancustommakanan,parent,false);
        MyViewHolder holder = new MyViewHolder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(RecycerViewAdapter.MyViewHolder holder, final int position) {
        holder.txtnama.setTypeface(gayahuruf);
        holder.txtstatus.setTypeface(gayahuruf);
        holder.txtharga.setTypeface(gayahuruf);


    holder.txtnama.setText(data_makanan.get(position).getNama1());
        holder.txtharga.setText(data_makanan.get(position).getHarga1());
        holder.txtstatus.setText(data_makanan.get(position).getStatus1());
        holder.txtharga.setText(data_makanan.get(position).getHarga1());
        Picasso.with(con).load(MyConstant.IMAGE_URL+data_makanan.get(position).getGambar1()).
                error(R.drawable.ic_launcher).into(holder.imgMakanan);

        //event click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kirim = new Intent(con, DetailMakanan.class);
                kirim.putExtra("nm",data_makanan.get(position).getNama1());
                kirim.putExtra("st",data_makanan.get(position).getStatus1());
                kirim.putExtra("hr",data_makanan.get(position).getHarga1());
                kirim.putExtra("gb",data_makanan.get(position).getGambar1());
                kirim.putExtra("i",data_makanan.get(position).getDetail1());
                con.startActivity(kirim);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data_makanan.size();
    }
        //view agar tidak error
    public class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView imgMakanan ;
            TextView txtnama,txtharga,txtstatus;

            public MyViewHolder(View itemView) {
                super(itemView);

                gayahuruf = Typeface.createFromAsset(con.getAssets(),"fonts/Lato-Light.ttf");

                imgMakanan = (ImageView) itemView.findViewById(R.id.imgmakanan);
                txtnama = (TextView) itemView.findViewById(R.id.txtnama);
                txtharga = (TextView) itemView.findViewById(R.id.txtharga);
                txtstatus = (TextView)itemView.findViewById(R.id.txtstatus);

            }
        }
}

