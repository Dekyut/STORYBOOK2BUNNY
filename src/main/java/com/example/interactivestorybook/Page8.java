package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page8 extends AppCompatActivity {
    TextView page8text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
        page8text = findViewById(R.id.page8text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page8text.setText("On his journey, " + pangalan + " encountered culinary challenges, from cooking under the light of a magical moon to creating dishes with ingredients that changed color with every bite. Each challenge tested his skills and pushed him to think outside the recipe book.");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage7(View view) {
        Intent i = new Intent(this, Page7.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void goToPage9(View view) {
        Intent i = new Intent(this, Page9.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }
}