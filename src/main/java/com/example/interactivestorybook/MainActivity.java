package com.example.interactivestorybook;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText pangalan;
    String name;

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pangalan = findViewById(R.id.pangalan);

        // Initialize MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.driftveil);

        // Start playing the background music
        mediaPlayer.start();
    }



    @Override
    protected void onDestroy() {
        // Release the MediaPlayer when the activity is destroyed
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();

    }

    public void goToPage2(View view) {
        name = pangalan.getText().toString();
        Toast.makeText(this, "Hello, " + name + "!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Page2.class);
        i.putExtra("name", name);
        startActivity(i);
    }
}
