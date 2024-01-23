package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page6 extends AppCompatActivity {
    TextView page6text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        page6text = findViewById(R.id.page6text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page6text.setText("With a bag of exotic spices, " + pangalan + " continued to the Herb Garden, guided by Sage, a knowledgeable herbalist, in selecting magical herbs for his dishes.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage5(View view) {
        Intent i = new Intent(this, Page5.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage7(View view) {
        Intent i = new Intent(this, Page7.class);
        startActivity(i);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}