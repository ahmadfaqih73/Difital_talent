package net.polije.digital_telent_per_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button  btnKalkulator,btninputnama;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninputnama = findViewById(R.id.Button4);
        btninputnama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InputActivity.class);
                startActivity(intent);
            }
        });
        final Button btn1 = findViewById(R.id.Button1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                btn1.setBackgroundColor(Color.YELLOW);
//            }
//        });
        btnKalkulator = findViewById(R.id.Button3);
        btnKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Kalkulator.class);
                startActivity(intent);
                finish();
            }
        });


    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu){
            startActivity(new Intent(this, net.polije.digital_telent_per_4.Menu.class));
        }else if(item.getItemId()==R.id.menu2){
            startActivity(new Intent(this,Menu2.class));
        }else if(item.getItemId()==R.id.menu3) {
            startActivity(new Intent(this, Menu3.class));
        } return true;
    }
}