package pl.zabrze.zs10.wuwalore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        TextView textView = findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("Points"));
    }
}