package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page9 extends AppCompatActivity {
    TextView page9text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);
        page9text = findViewById(R.id.page9text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page9text.setText(pangalan +"'s path eventually led him to the Dessert Kingdom, a sweet paradise where sugary delights awaited.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage8(View view) {
        Intent i = new Intent(this, Page8.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage10(View view) {
        Intent i = new Intent(this, Page10.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}