package com.example.samo_.imagenimagenbuttonimageninternet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLocal,imgInternet;
    private ImageButton imgBoton;
    private TextView local,boton,internet;

    private boolean primera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primera = true;

        imgBoton = (ImageButton) findViewById(R.id.imageButton);
        imgInternet = (ImageView) findViewById(R.id.imageViewInternet);
        imgLocal = (ImageView) findViewById(R.id.imageViewLocal);
        internet = (TextView) findViewById(R.id.textViewInternet);
        boton = (TextView) findViewById(R.id.textViewImagenBoton);
        local = (TextView) findViewById(R.id.textViewLocal);

        // Importar en Gradle Scripts/build.gradel(app) el repo de glide sincronizar despues
        // Agregar los permisos de INTERNET en Manifestes
        String url = "http://www.freeiconspng.com/uploads/green-android-icon-31.png";
        Glide.with(this).load(url).into(imgInternet);

        imgBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (primera){
                    imgBoton.setImageResource(R.drawable.android2);
                    primera = false;
                }else{
                    imgBoton.setImageResource(R.drawable.android1);
                    primera = true;
                }

            }
        });

    }
}
