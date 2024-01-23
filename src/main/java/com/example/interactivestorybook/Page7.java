package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page7 extends AppCompatActivity {
    TextView page7text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        page7text = findViewById(R.id.page7text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page7text.setText("Venturing further, " + pangalan +" discovered the Cheese Caves, where cheeses aged to perfection. In this cheesy haven, he met Jasper the Cheese Master, who shared the secrets of crafting artisanal cheeses.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage6(View view) {
        Intent i = new Intent(this, Page5.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage8(View view) {
        Intent i = new Intent(this, Page8.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}