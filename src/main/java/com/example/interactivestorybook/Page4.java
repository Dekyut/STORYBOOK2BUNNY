package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page4 extends AppCompatActivity {
    TextView page4text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        page4text = findViewById(R.id.page4text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page4text.setText( pangalan + ", armed with his chef's hat, explored the Spice Market for rare spices.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage3(View view) {
        Intent i = new Intent(this, Page3.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage5(View view) {
        Intent i = new Intent(this, Page5.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}