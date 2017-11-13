package codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import codeclan.com.wordcounter.models.Counter;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private int actualWordCount;
    private EditText userInput;
    private Button counterButton;
    private Counter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.result = (TextView) findViewById(R.id.result);
        this.userInput = (EditText) findViewById(R.id.userInput);
        this.counterButton = (Button) findViewById(R.id.counterButton);
        counter = new Counter();
    }

    public void onButtonClicked(View view) {
        String wordsToCount = this.userInput.getText().toString();
        int wordCount = counter.getWordsCount(wordsToCount);
        this.result.setText(Integer.toString(wordCount));

    }
}
