package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //ui로 사용할 레이아웃 xml파일을 지정한다
        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);

        bmiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String tall = tallField.getText().toString();
                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                TextView resultLabel = findViewById(R.id.resultLabel);
                resultLabel.setText("키: " + tall + "체중: " + weight + "bmi :" + bmi);
            }
        });
    }
}
