package com.example.vize_mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView


class baslangic() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        var text = findViewById<TextView>(R.id.text)

        fun yazibuyut()
        {
            object: CountDownTimer(3000,1){
                override fun onTick(p0: Long) {

                    if (p0>1000){
                        text.setTextSize((40 - p0/70).toFloat())
                    }

                }

                override fun onFinish() {
                    var first= Intent(applicationContext,first::class.java)
                    startActivity(first)
                    finish()
                }
            }.start()
        }
        yazibuyut()
    }
}

