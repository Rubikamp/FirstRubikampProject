package unsplash.rubikamp.sanaebadi.info;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class EvenOddActivity extends AppCompatActivity {

    private AppCompatEditText editTextNumber;
    private AppCompatButton buttonResult;
    private AppCompatTextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_odd);

        editTextNumber = findViewById(R.id.edittext_number);
        buttonResult = findViewById(R.id.button_result);
        textViewResult = findViewById(R.id.textview_result);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editTextNumber.getText().toString();

                if (Long.parseLong(input) % 2 == 0) {
                    textViewResult.setText("Your number is Odd");
                } else {
                    textViewResult.setText("Your number is Even");
                }


            }
        });
    }
}