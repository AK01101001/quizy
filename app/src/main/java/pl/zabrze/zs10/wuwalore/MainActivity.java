package pl.zabrze.zs10.wuwalore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    View start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        start.setOnClickListener(
                view -> begin()
        );
    }

    public void begin()
    {
        Toast.makeText(this, "initialize quiz", Toast.LENGTH_SHORT).show();
        Intent questions = new Intent(MainActivity.this, Questions.class);
        startActivity(questions);
    }
}