package com.example.compterendu11;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.v("MainActivity", "Verbose: onCreate started");  // Très détaillé, utile pour le développement
        Log.d("MainActivity", "Debug: Initializing EdgeToEdge and setting content view");


        EdgeToEdge.enable(this);
        Log.i("MainActivity", "Info: EdgeToEdge enabled");


        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Debug: Content view set to activity_main");


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Log.d("MainActivity", "Debug: Window insets applied with padding");
            return insets;
        });


        Log.i("MainActivity", "Info: onCreate completed successfully");


        Log.w("MainActivity", "Warning: No specific action assigned to certain views");


        try {

            throw new Exception("Simulated error");
        } catch (Exception e) {
            Log.e("MainActivity", "Error: An error occurred in onCreate", e);
        }
    }
}
