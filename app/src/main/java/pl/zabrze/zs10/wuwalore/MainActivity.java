package pl.zabrze.zs10.wuwalore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    View start;
    View questions_obj;
    View summary_obj;
    TextView summary_text;

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
        setContentView(R.layout.activity_main);
        start =findViewById(R.id.start);
        questions_obj = findViewById(R.id.questions_obj);
        summary_obj = findViewById(R.id.summary_obj);
        summary_text = findViewById(R.id.summary_text);
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
    }

    public void Begin(View view)
    {
        start.setVisibility(View.INVISIBLE);
        questions_obj.setVisibility(View.VISIBLE);
        summary_obj = findViewById(R.id.summary_obj);
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
        Toast.makeText(this, "summary", Toast.LENGTH_SHORT).show();
        questions_obj.setVisibility(View.INVISIBLE);
        summary_obj.setVisibility(View.VISIBLE);
        summary_text.setText(Integer.toString(correctAnswersCounter));
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