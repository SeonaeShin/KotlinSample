package com.example.kotlinsample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    //버튼이 클릭된 횟수 저장
    int clickCount= 0;

    //Activity의 시작시간 저자
    final long startTime = System.currentTimeMillis();

    //Activity 시작 시간을 보여주는 TextView
    TextView startTimeLabel;
    //클릭된횟수 보여주는 텏트뷰
    TextView clickCountLabel;
    //클릭 버튼
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        startTimeLabel  = findViewById(R.id.startTimeLabel);
        clickCountLabel = findViewById(R.id.clickCountLabel);
        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime);
        startTimeLabel.setText("Activity 시작시간: " + timeText);
        clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                clickCount = clickCount + 1;
                clickCountLabel.setText("버튼이 클릭된 횟수: " + clickCount);
            }

        });
    }
}
