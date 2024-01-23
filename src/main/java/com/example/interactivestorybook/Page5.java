package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page5 extends AppCompatActivity {
    TextView page5text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        page5text = findViewById(R.id.page5text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page5text.setText("There, he met Hannah, a wise spice merchant, who shared ancient blending techniques.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage4(View view) {
        Intent i = new Intent(this, Page4.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage6(View view) {
        Intent i = new Intent(this, Page6.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}