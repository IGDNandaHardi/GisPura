package com.example.gispurabuleleng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView datanama,dataalamat;
    Button btnlokasi;
    ImageView datagambar;
    public static String id,nama,alamat,gambar;
    public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        dataalamat=findViewById(R.id.tv_alamat);
        btnlokasi=findViewById(R.id.btn_lokasi);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        Picasso.get().load(gambar).into(datagambar);



    }
}
