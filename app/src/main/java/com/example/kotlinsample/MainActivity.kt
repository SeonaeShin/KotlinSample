package com.example.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button1이 클릭된 경우 이벤트 리스너 설정
        button1.setOnClickListener{
            //intent로 bmiJavaActivity를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        //button2 클릭된 경우 이벤트 리스너 설정
        button2.setOnClickListener{
            //intent로 bmiKotlinActivity를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        //button3 클릭된 경우 이벤트 리스너 설정
        button3.setOnClickListener{
            //intent로 bmiKotlinActivity를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }

        //button4 클릭된 경우 이벤트 리스너 설정
        button4.setOnClickListener{
            //intent로 bmiKotlinActivity를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }

        //button6 클릭된 경우 이벤트 리스너 설정
        button6.setOnClickListener{
            //intent로 bmiKotlinActivity를 타겟으로 지정하고 startActivity 로 실행
            startActivity(Intent(this@MainActivity, ControlKotlinActivity::class.java))
        }


    }


}
