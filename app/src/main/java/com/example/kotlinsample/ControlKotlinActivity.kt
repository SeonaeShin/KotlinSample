package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control);

        //실행버튼 클릭시
        button.setOnClickListener {
            // 입력값 검증

            val UserNumber = textView.text.toString()
            var ComNumber = arrayOfNulls<Int?>(3);


            val userNumberVeri = """^\d{3}$""".toRegex()

            if (userNumberVeri.find(UserNumber) == null
                || UserNumber.toSet().size < 3
            ) userTextView.setText("숫자 세개 다시 입력하세요.")
            else {
                userTextView.setText("유저가 입력한 값은 :" + UserNumber);
            }

            var myNumbers = arrayOf(UserNumber[0].toString().toInt(), UserNumber[1].toString().toInt(), UserNumber[2].toString().toInt());

            ComNumber = makeRandomValues();
            comTextView.setText("컴퓨터가 입력한 값은 :" + ComNumber[0] + ComNumber[1] + ComNumber[2]);

            var comNumbers = arrayOf(ComNumber[0], ComNumber[1], ComNumber[2]);
            checkScore(myNumbers, comNumbers);
        }
    }

    fun makeRandomValues(): Array<Int?> {
        // 012~987 사이 중복 없는 3자리 난수 생성
        var ComNumber_Temp = arrayOfNulls<Int>(3);

        ComNumber_Temp[0] = (0..9).random()

        do {
            ComNumber_Temp[1] = (0..9).random()
        } while (ComNumber_Temp[1] == ComNumber_Temp[0])

        do {
            ComNumber_Temp[2] = (0..9).random()
        } while (ComNumber_Temp[2] == ComNumber_Temp[0]
            || ComNumber_Temp[2] == ComNumber_Temp[1]
        )
        return ComNumber_Temp
    }

    fun checkScore(coluser: Array<Int>, colcom: Array<Int?>) {

        var ball = 0;
        var strike = 0;

        for ((i, user) in coluser.withIndex()) {
            for ((j, com) in colcom.withIndex()) {
                if (coluser[i] == colcom[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        if(strike == 0 && ball == 0){
            resultLabel.setText("아웃!");
        }else{
            resultLabel.setText(""+strike+"strike, " + ball + "ball!!");
        }

    }
}