package com.example.vize_mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class fourth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        var corbasecim = intent.getStringExtra("corbasecim")
        
        var seek1 = intent.getStringExtra("seek1")
        
        var seek2 = intent.getStringExtra("seek2")
        
        var total = intent.getStringExtra("total")
        
        var extra = intent.getStringExtra("extra")

        var siparis = findViewById<TextView>(R.id.textView16)
        
        var close = findViewById<ImageView>(R.id.imageView6)
        
        var firsttext = findViewById<TextView>(R.id.textView8)
        
        var secondtext = findViewById<TextView>(R.id.textView9)
        
        var thirdtext = findViewById<TextView>(R.id.textView15)

        var seek1_x=""
        var seek2_y=""

        if(seek1=="0")
        {
            seek1_x = "tuzsuz"
        }
        else if (seek1=="1")
        {
            seek1_x = "az Tuzlu"
        }
        else
        {
            seek1_x = "çok tuzlu"
        }

        if(seek2=="0")
        {
            seek2_y = "acısız"
        }
        else if (seek2=="1")
        {
            seek2_y = "az Acılı"
        }
        else
        {
            seek2_y = "çok Acılı"
        }

   
        fun efekt()
        {
            object : CountDownTimer(500,90)
            {
                override fun onTick(p0: Long) {
                }

                override fun onFinish() {

                    if(siparis.visibility==View.VISIBLE)
                    {
                        siparis.visibility=View.INVISIBLE
                    }
                    else
                    {
                        siparis.visibility=View.VISIBLE
                    }
                    efekt()
                }
            }.start()
        }
        efekt()

        firsttext.text = "$corbasecim Çorbası Çeeek, $seek1_x ve $seek2_y"
        if(total!="")
        {
            secondtext.visibility= View.VISIBLE
            secondtext.text = "İçinde\n$total\nolsun"
        }
        if (extra!="")
        {
            thirdtext.visibility = View.VISIBLE
            thirdtext.text="Ekstra İstekler: "+extra
        }
        else
        {
            thirdtext.visibility = View.INVISIBLE
        }

        siparis.setOnClickListener {
            var x = Intent(this, second::class.java)
            finish()
            startActivity(x)
        }

        close.setOnClickListener {
            val uyari = AlertDialog.Builder(this@fourth)
            uyari.setTitle("çıkış")
            uyari.setMessage("çıkmak istediğinize emin misiniz?")
            uyari.setIcon(R.drawable.harf_logo)
            uyari.setPositiveButton("evet"){DialogInterface, i->
                finish()
                System.exit(0)
            }
            uyari.setNegativeButton("hayır"){DialogInterface, i->

            }
            uyari.create().show()
        }

    }
}