package pl.zabrze.zs10.wuwalore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    TextView textView;
    String summary;
    String questions;
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        textView.setText("Points : "+summary+" / "+questions);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText("Points : "+summary+" / "+questions);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        textView = findViewById(R.id.textView);
        summary = getIntent().getStringExtra("Points");
        questions = getIntent().getStringExtra("Questions");
        textView.setText("Points : "+summary+" / "+questions);
    }
}