package com.zec.qr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ders_programi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ders_programi);
    }
    public void tara(View view) {
        Intent intent_tara = new Intent("com.google.zxing.client.android.SCAN");
        intent_tara.putExtra("SCAN_MODE", "QR_CODE_MODE");
        startActivityForResult(intent_tara, 0);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent_tara) {
        if (requestCode == 0) {
            TextView sonuc=(TextView)findViewById(R.id.sonuc);
            if (resultCode == RESULT_OK) {

                String qr_sonuc = intent_tara.getStringExtra("SCAN_RESULT");
                Intent goster = new Intent(this, ders_goster.class);


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
                    case "2qr":
                        goster.putExtra("qr_sonuc", "Salon - 105");
                        startActivity(goster);
                        break;
                    case "11qr":
                        goster.putExtra("qr_sonuc", "Salon - 106");
                        startActivity(goster);
                        break;
                    case "12qr":
                        goster.putExtra("qr_sonuc", "Salon - 107");
                        startActivity(goster);
                        break;
                    case "13qr":
                        goster.putExtra("qr_sonuc", "Salon - 108");
                        startActivity(goster);
                        break;
                    case "14qr":
                        goster.putExtra("qr_sonuc", "Salon - 109");
                        startActivity(goster);
                        break;
                    case "15qr":
                        goster.putExtra("qr_sonuc", "Salon - 110");
                        startActivity(goster);
                        break;
                    case "16qr":
                        goster.putExtra("qr_sonuc", "Salon - 111");
                        startActivity(goster);
                        break;
                    case "29qr":
                        goster.putExtra("qr_sonuc", "Salon - 200");
                        startActivity(goster);
                        break;
                    case "17qr":
                        goster.putExtra("qr_sonuc", "Salon - 201");
                        startActivity(goster);
                        break;
                    case "18qr":
                        goster.putExtra("qr_sonuc", "Salon - 202");
                        startActivity(goster);
                        break;
                    case "19qr":
                        goster.putExtra("qr_sonuc", "Salon - 203");
                        startActivity(goster);
                        break;
                    case "53qr":
                        goster.putExtra("qr_sonuc", "Enformatik");
                        startActivity(goster);
                        break;
                    case "20qr":
                        goster.putExtra("qr_sonuc", "Salon - 205");
                        startActivity(goster);
                        break;
                    case "21qr":
                        goster.putExtra("qr_sonuc", "Salon - 206");
                        startActivity(goster);
                        break;
                    case "22qr":
                        goster.putExtra("qr_sonuc", "Salon - 207");
                        startActivity(goster);
                        break;
                    case "23qr":
                        goster.putExtra("qr_sonuc", "Salon - 208");
                        startActivity(goster);
                        break;
                    case "24qr":
                        goster.putExtra("qr_sonuc", "Salon - 209");
                        startActivity(goster);
                        break;
                    case "25qr":
                        goster.putExtra("qr_sonuc", "Salon - 210");
                        startActivity(goster);
                        break;
                    case "26qr":
                        goster.putExtra("qr_sonuc", "Salon - 211");
                        startActivity(goster);
                        break;
                    case "27qr":
                        goster.putExtra("qr_sonuc", "Salon - 212");
                        startActivity(goster);
                        break;
                    case "28qr":
                        goster.putExtra("qr_sonuc", "Salon - 213");
                        startActivity(goster);
                        break;
                    case "164qr":
                        goster.putExtra("qr_sonuc", "Salon - 214");
                        startActivity(goster);
                        break;
                    case "30qr":
                        goster.putExtra("qr_sonuc", "Salon - 301");
                        startActivity(goster);
                        break;
                    case "31qr":
                        goster.putExtra("qr_sonuc", "Salon - 302");
                        startActivity(goster);
                        break;
                    case "32qr":
                        goster.putExtra("qr_sonuc", "Salon - 303");
                        startActivity(goster);
                        break;
                    case "33qr":
                        goster.putExtra("qr_sonuc", "Salon - 304");
                        startActivity(goster);
                        break;
                    case "6qr":
                        goster.putExtra("qr_sonuc", "Salon - 305");
                        startActivity(goster);
                        break;
                    case "7qr":
                        goster.putExtra("qr_sonuc", "Salon - 306");
                        startActivity(goster);
                        break;
                    case "35qr":
                        goster.putExtra("qr_sonuc", "Salon - 307");
                        startActivity(goster);
                        break;
                    case "37qr":
                        goster.putExtra("qr_sonuc", "Fen Lab.");
                        startActivity(goster);
                        break;
                    case "46qr":
                        goster.putExtra("qr_sonuc", "Fizik Lab");
                        startActivity(goster);
                        break;
                    case "130qr":
                        goster.putExtra("qr_sonuc", "Fiziko Kimya");
                        startActivity(goster);
                        break;
                    case "64qr":
                        goster.putExtra("qr_sonuc", "Halil İnalcık");
                        startActivity(goster);
                        break;
                    case "44qr":
                        goster.putExtra("qr_sonuc", "Kimya Lab");
                        startActivity(goster);
                        break;
                    case "39qr":
                        goster.putExtra("qr_sonuc", "Bil. Lab. A");
                        startActivity(goster);
                        break;
                    case "40qr":
                        goster.putExtra("qr_sonuc", "Bil. Lab. B");
                        startActivity(goster);
                        break;
                    case "41qr":
                        goster.putExtra("qr_sonuc", "Bil. Lab. C");
                        startActivity(goster);
                        break;
                    case "42qr":
                        goster.putExtra("qr_sonuc", "Bil. Lab. D");
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

}
