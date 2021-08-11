package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListNegara_Activity extends AppCompatActivity {

    private ListView pilihanNegara;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_negara);
        getSupportActionBar().setTitle("List View Negara");

        String[] countryArray = new String[]{
                "Indonesia","Malaysia","Brunei","Timor Leste","Pilipina","Thailand","Vietnam",
                "Singapura","Laos","Nepal", "Kamboja","Myamar","Inggris","India","Korea Utara"
        };
        pilihanNegara = findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countryArray);
        pilihanNegara.setAdapter(adapter);
        pilihanNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int l, long k) {
                Toast.makeText(getApplicationContext(),countryArray[l], Toast.LENGTH_SHORT).show();
            }
        });
    }
}