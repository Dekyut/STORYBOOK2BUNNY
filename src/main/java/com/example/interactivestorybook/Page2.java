package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {
    TextView page2text;
    String pangalan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        page2text = findViewById(R.id.page2text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        page2text.setText("In the bustling town of Culinary Haven, there lived a passionate and ambitious chef named " + pangalan + ". Known for his innovative dishes and insatiable curiosity, " + pangalan + " dreamt of exploring the culinary world beyond the familiar flavors of his hometown.");
    }

    public void goToMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    public void goToPage3(View view) {
        Intent i = new Intent(this, Page3.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }




}