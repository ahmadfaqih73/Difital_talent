package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    private Button btnOperasi,btnbersihkan;
    private EditText Jari,Bilangan;
    private TextView hasil,hasil2,hasil3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        btnOperasi = findViewById(R.id.Operasi);
        btnbersihkan = findViewById(R.id.bersihkan);
        Jari = findViewById(R.id.jari);
        Bilangan = findViewById(R.id.Bilangan);
        hasil = findViewById(R.id.hasil);
        hasil2 = findViewById(R.id.hasil2);
        hasil3 = findViewById(R.id.hasil3);

        btnOperasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jari = Double.parseDouble(String.valueOf(Jari.getText()));
                double bilangan = Double.parseDouble(String.valueOf(Bilangan.getText()));
                double Luaslingkarang = (3.14 * jari*jari);
                double KLL = (3.14 *(2*jari));
               double perbandingan= (if (bilangan < jari){
                   hasil3.setText();
                });

                hasil.setText(String.valueOf(Luaslingkarang));
                hasil2.setText(String.valueOf(KLL));
            }
        });

        btnbersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Jari.setText("");
                hasil.setText("0");
                hasil2.setText("0");
            }
        });


    }
}