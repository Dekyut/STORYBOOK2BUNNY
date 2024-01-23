package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page3 extends AppCompatActivity {
    TextView page3text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        page3text = findViewById(R.id.page3text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page3text.setText(pangalan + " found an ancient cookbook in his grandmother's attic, filled with magical recipes. Inspired, he embarked on a culinary journey.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage2(View view) {
        Intent i = new Intent(this, Page2.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage4(View view) {
        Intent i = new Intent(this, Page4.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}