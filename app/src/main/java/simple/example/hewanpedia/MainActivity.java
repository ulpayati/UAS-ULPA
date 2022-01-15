package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCapung,btnSemut,btnUlar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnCapung = findViewById(R.id.btn_buka_ras_capung);
        btnSemut = findViewById(R.id.btn_buka_ras_semut);
        btnUlar = findViewById(R.id.btn_buka_ras_ular);
        btnCapung.setOnClickListener(view -> bukaGaleri("Capung"));
        btnSemut.setOnClickListener(view -> bukaGaleri("Semut"));
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity capung");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

    public void btn_profil(View view) {
        Intent intent = new Intent(MainActivity.this, Myprofil.class);
        startActivity(intent);
    }
}