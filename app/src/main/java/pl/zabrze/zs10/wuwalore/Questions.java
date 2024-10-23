package pl.zabrze.zs10.wuwalore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Questions extends AppCompatActivity {
    TextView question;
    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;


    int questionCounter = 0;
    int numberOfQuestions;
    int correctAnswersCounter = 0;

    ArrayList<Question> questions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        question = findViewById(R.id.question);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);

        questions.add(new Question("Who you met at the start of the game?","Scar and Yangyang","Baizahi and Chixia","Yangyang and Chixia","Scar and Baizahi",3));
        questions.add(new Question("What Rover saw in first vision?","Jinhisi - Madame Magistrate","lento helix - tacetite material","Yangyang - Midnight Ranger","Jue - Jinzhou Sentinel",4));
        questions.add(new Question("What happened after fight beetween Crownlees and Rover?","Rover has died","Crownlees has vaporized","Rover has absorbed Crownlees ","Rover escaped the Crownlees",3));
        numberOfQuestions=questions.size();
        a1.setOnClickListener(
                view -> checkCorection(1)
        );
        a2.setOnClickListener(
                view -> checkCorection(2)
        );
        a3.setOnClickListener(
                view -> checkCorection(3)
        );
        a4.setOnClickListener(
                view -> checkCorection(4)
        );
        nextQuestion();
    }
    public void nextQuestion()
    {
        if (questionCounter<numberOfQuestions) {
            question.setText(questions.get(questionCounter).question);
            a1.setText(questions.get(questionCounter).answear1);
            a2.setText(questions.get(questionCounter).answear2);
            a3.setText(questions.get(questionCounter).answear3);
            a4.setText(questions.get(questionCounter).answear4);
        }
        else {
            summary();
        }
    }
    private void summary()
    {
        Intent summary = new Intent(Questions.this,Summary.class);
        summary.putExtra("Points",correctAnswersCounter);
        startActivity(summary);
    }
    private void tip()
    {
        Intent tip_intent = new Intent(Questions.this,TipActivity.class);
    }
    void checkCorection(int id)
    {
        if (questions.get(questionCounter).corectAnswear==id)
        {
            correctAnswersCounter++;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        }
        questionCounter++;
        nextQuestion();
    }
}