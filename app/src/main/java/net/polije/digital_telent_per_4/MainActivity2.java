package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView ImageNama,Imagekalkulator,ImageNegara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageNama = findViewById(R.id.imageView1);
        Imagekalkulator = findViewById(R.id.imageView2);
        ImageNegara = findViewById(R.id.imageView3);

        ImageNama.setOnClickListener(this::onClick);
        setTitle("Home");
        ImageNegara.setOnClickListener(this::onClick);
        Imagekalkulator.setOnClickListener(this::onClick);
        setTitle("Kalkulator");

    }

    public void onClick(View view){
        int id = view.getId();
        switch (id){
            case R.id.imageView1:
                Intent i = new Intent(this,InputActivity.class);
                startActivity(i);
                break;

            case R.id.imageView2:
                Intent j = new Intent(this,Kalkulator2.class);
                startActivity(j);
                break;

            case R.id.imageView3:
                Intent l = new Intent(this,ListNegara_Activity.class);
                startActivity(l);
                break;

        }
    }
}