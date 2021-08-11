package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    private EditText inputNilai;
    private TextView hasil;
    private Button tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        inputNilai = findViewById(R.id.editTnilai);
        hasil= findViewById(R.id.textView4);
        tampil = findViewById(R.id.button);

        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNilai.getText().toString().isEmpty()){
                 Toast.makeText(InputActivity.this,"Nama Kosong",Toast.LENGTH_SHORT).show();
                }else {
                    hasil.setText(inputNilai.getText().toString());
                }
            }
        });
    }
}