package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator2 extends AppCompatActivity {
    private TextView hasilakhir;
    private EditText Nilai1, Nilai2;
    private Button btnKali, btnBagi, btnTambah, btnKurang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator2);
        Nilai1 = findViewById(R.id.input1);
        Nilai2 = findViewById(R.id.input2);
        hasilakhir = findViewById(R.id.hasil);
    }


    public void actionTambah(View view) {
        double nilai1 = Double.parseDouble(Nilai1.getText().toString());
        double nilai2 = Double.parseDouble(Nilai2.getText().toString());
        double akhir = nilai1 + nilai2;
        hasilakhir.setText(String.valueOf(akhir));
    }

    public void actionBersih(View view) {
        Nilai1.setText("");
        Nilai2.setText("");
        hasilakhir.setText("0.0");
    }

    public void actionKurang(View view) {
        double nilai1 = Double.parseDouble(Nilai1.getText().toString());
        double nilai2 = Double.parseDouble(Nilai2.getText().toString());
        double akhir = nilai1 - nilai2;
        hasilakhir.setText(String.valueOf(akhir));
    }

    public void actionKali(View view) {
        double nilai1 = Double.parseDouble(Nilai1.getText().toString());
        double nilai2 = Double.parseDouble(Nilai2.getText().toString());
        double akhir = nilai1 * nilai2;
        hasilakhir.setText(String.valueOf(akhir));
    }

    public void actionBagi(View view) {
        double nilai1 = Double.parseDouble(Nilai1.getText().toString());
        double nilai2 = Double.parseDouble(Nilai2.getText().toString());
        double akhir = nilai1 / nilai2;
        hasilakhir.setText(String.valueOf(akhir));
    }
}