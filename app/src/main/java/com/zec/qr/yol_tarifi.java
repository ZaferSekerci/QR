package com.zec.qr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class yol_tarifi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yol_tarifi);
    }
    public void home_go(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void tara(View view) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
        startActivityForResult(intent, 0);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent_tara) {
        if (requestCode == 0) {
            TextView sonuc=(TextView)findViewById(R.id.sonuc);
            if (resultCode == RESULT_OK) {

                String qr_sonuc = intent_tara.getStringExtra("SCAN_RESULT");
                Intent goster = new Intent(this, yol_goster.class);

                switch (qr_sonuc) {
                    case "8qr":
                        goster.putExtra("qr_sonuc", "Salon - 101");
                        startActivity(goster);
                        break;
                    case "9qr":
                        goster.putExtra("qr_sonuc", "Salon - 102");
                        startActivity(goster);
                        break;
                    case "10qr":
                        goster.putExtra("qr_sonuc", "Salon - 103");
                        startActivity(goster);
                        break;
                    case "1qr":
                        goster.putExtra("qr_sonuc", "Salon - 104");
                        startActivity(goster);
                        break;
                    default:
                        sonuc.setText("Yanlış Bir QR Kod Tarattınız");
                }

            } else if (resultCode == RESULT_CANCELED) {
                sonuc.setText("Tarama İptal Edildi");
            }
        }
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
