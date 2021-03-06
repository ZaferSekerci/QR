package com.zec.qr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class yol_goster extends AppCompatActivity {

    public void yol_back(View view) {
        Intent intent = new Intent(this, yol_tarifi.class);
        startActivity(intent);
    }
    public void home_go(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yol_goster);
        Bundle gelen;
        gelen = getIntent().getExtras();
        TextView salonAdi=(TextView)findViewById(R.id.baslik);
        salonAdi.setText(gelen.getString("qr_sonuc"));
    }

    public void dekanlik(View view){
        Intent goster = new Intent(this, yol_gidis.class);
        TextView konum=(TextView)findViewById(R.id.baslik);
        goster.putExtra("gelen", "Dekanlık");
        goster.putExtra("gelen2",konum.getText());
        startActivity(goster);
    }
    public void kutuphane(View view){
        Intent goster = new Intent(this, yol_gidis.class);
        TextView konum=(TextView)findViewById(R.id.baslik);
        goster.putExtra("gelen", "Kütüphane");
        goster.putExtra("gelen2",konum.getText());
        startActivity(goster);
    }
    public void ogr_isleri(View view){
        Intent goster = new Intent(this, yol_gidis.class);
        TextView konum=(TextView)findViewById(R.id.baslik);
        goster.putExtra("gelen", "Öğrenci İşleri");
        goster.putExtra("gelen2",konum.getText());
        startActivity(goster);
    }

    public void home_goo(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void yol_go(View view) {
        Intent intent = new Intent(this, yol_tarifi.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
