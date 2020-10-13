package mx.edu.tesoem.isc.fvm.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {
    ImageView Miimagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        Miimagen = findViewById(R.id.bnturl);
        Picasso.get()
                .load("https://www.muycomputer.com/wp-content/uploads/2019/12/android-1000x600.jpg")
                .error(R.mipmap.ic_launcher_round)
                .into(Miimagen);

    }
}