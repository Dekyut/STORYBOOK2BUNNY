package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page10 extends AppCompatActivity {
    TextView page10text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
        page10text = findViewById(R.id.page10text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page10text.setText("As " + pangalan +"'s culinary skills flourished, he gained a reputation as a renowned chef. Word of his culinary journey spread, and soon, chefs from around the world sought his expertise." +pangalan+ " hosted international culinary events, sharing the magic he had discovered on his quest.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage9(View view) {
        Intent i = new Intent(this, Page9.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage11(View view) {
        Intent i = new Intent(this, Page11.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}