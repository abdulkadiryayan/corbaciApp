package com.example.vize_mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class first : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var text1 = findViewById<TextView>(R.id.textView10)
        var text2 = findViewById<TextView>(R.id.textView11)
        var text3 = findViewById<TextView>(R.id.textView12)
        var text4 = findViewById<TextView>(R.id.textView13)
        var text5 = findViewById<TextView>(R.id.textView14)

        var image1 = findViewById<ImageView>(R.id.imageView100)
        var image2 = findViewById<ImageView>(R.id.imageView120)
        var image3 = findViewById<ImageView>(R.id.imageView130)
        var image4 = findViewById<ImageView>(R.id.imageView140)
        var image5 = findViewById<ImageView>(R.id.imageView150)

        text1.setOnClickListener {
            image1.visibility = View.VISIBLE


        }
        text2.setOnClickListener {
            if (image1.visibility == View.VISIBLE) {
                image2.visibility = View.VISIBLE

            }
        }
        text3.setOnClickListener {

            if (image2.visibility == View.VISIBLE) {
                image3.visibility = View.VISIBLE

            }
        }

        text4.setOnClickListener {

            if (image3.visibility == View.VISIBLE) {
                image4.visibility = View.VISIBLE

            }
        }


        text5.setOnClickListener {
            if (image4.visibility == View.VISIBLE) {
                image5.visibility = View.VISIBLE
                var tasarim = layoutInflater.inflate(R.layout.yenitoast, null)

                var tost_ozel2 = Toast(applicationContext)
                tost_ozel2.view = tasarim
                tost_ozel2.duration = Toast.LENGTH_SHORT
                tost_ozel2.show()
                object : CountDownTimer(2000, 1000) {
                    override fun onTick(p0: Long) {

                    }

                    override fun onFinish() {
                        var x = Intent(applicationContext, second::class.java)
                        startActivity(x)
                        finish()
                    }

                }.start()

            }
        }
    }
}