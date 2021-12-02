package unsplash.rubikamp.sanaebadi.info;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;


public class BMIActivity extends AppCompatActivity {

    private AppCompatEditText ediTextHeight, ediTextWeight;
    private AppCompatButton buttonCalculate;
    private AppCompatTextView textViewResult;

    private static final String TAG = "BMIActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        ediTextHeight = findViewById(R.id.edittext_height);
        ediTextWeight = findViewById(R.id.edittext_weight);
        buttonCalculate = findViewById(R.id.button_calculate_bmi);
        textViewResult = findViewById(R.id.textview_result);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String heightInput = ediTextHeight.getText().toString();
                String weighInput = ediTextWeight.getText().toString();
                double result = Double.parseDouble(weighInput) / (Double.parseDouble(heightInput) * Double.parseDouble(heightInput));
                textViewResult.setText("Your Bmi is: " + result);
            }
        });

    }
}