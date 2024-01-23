package com.example.interactivestorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page11 extends AppCompatActivity {
    TextView page11text;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        page11text = findViewById(R.id.page11text);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        if (pangalan != null) {
            page11text.setText("Back in Culinary Haven, " +pangalan+ " realized that the true magic of his journey was in the connections he made and the joy he brought to others through his culinary creations. With a heart full of gratitude and a wealth of knowledge, " + pangalan + " continued to explore, knowing that the world of flavors was vast and his culinary adventure was far from over. And so, the story of "+pangalan+", the adventurous chef, became a legend in the world of food, inspiring aspiring chefs to follow their taste buds and explore the magical realm of cuisine. THE END.\n");
        } else {
            Toast.makeText(this, "Error: Name not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToPage10(View view) {
        Intent i = new Intent(this, Page10.class);
        i.putExtra("name", pangalan);;
        startActivity(i);
        finish();
    }

    public void BackToMain(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("name", pangalan);;
        Toast.makeText(this, "You have gone back to Main Menu.",
                Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }


}