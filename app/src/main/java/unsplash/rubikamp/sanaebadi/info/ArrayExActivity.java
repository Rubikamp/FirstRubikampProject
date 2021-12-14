package unsplash.rubikamp.sanaebadi.info;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class ArrayExActivity extends AppCompatActivity {

    private int[] numbers;
    private String[] names;


    private AppCompatTextView textFirstName, textFirstNumber, textSecondName, textSecondNumber, textThirdName, textThirdNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_ex);

        textFirstName = findViewById(R.id.text_first_name);
        textFirstNumber = findViewById(R.id.text_first_number);
        textSecondName = findViewById(R.id.text_second_name);
        textSecondNumber = findViewById(R.id.text_second_number);
        textThirdName = findViewById(R.id.text_third_name);
        textThirdNumber = findViewById(R.id.text_third_number);

        numbers = new int[3];
        names = new String[3];
        numbers[0] = 912345678;
        numbers[1] = 911345673;
        numbers[2] = 918765432;

        names[0] = "Hasti";
        names[1] = "MReza";
        names[2] = "Reza";

        textFirstName.setText(names[0]);
        textFirstNumber.setText(String.valueOf(numbers[0]));

        textSecondName.setText(names[1]);
        textSecondNumber.setText(numbers[1] + "");

        textThirdName.setText(names[2]);
        textThirdNumber.setText(numbers[2] + "");

    }
}