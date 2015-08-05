package com.zec.qr;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void etkinlik_go(View view) {
        Intent intent = new Intent(this, etkinlik.class);
        startActivity(intent);
    }
    public void ders_go(View view) {
        Intent intent = new Intent(this, ders_programi.class);
        startActivity(intent);
    }
    public void sosyal_go(View view) {
        Intent intent = new Intent(this, sosyal_medya.class);
        startActivity(intent);
    }
    public void yol_go(View view) {
        Intent intent = new Intent(this, yol_tarifi.class);
        startActivity(intent);
    }
    public void hakkimizda_go(View view) {
        Intent intent = new Intent(this, hakkimizda.class);
        startActivity(intent);
    }
    public void duyurular_go(View view) {
        Intent intent = new Intent(this, duyurular.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
