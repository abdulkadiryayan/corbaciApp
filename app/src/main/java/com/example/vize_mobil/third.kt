package com.example.vize_mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var corbasecim = intent.getStringExtra("corba")

        var corbaview = findViewById<TextView>(R.id.textView)

        var siparis = findViewById<Button>(R.id.button)

        var seek1 = findViewById<SeekBar>(R.id.seekBar)

        var seek2 = findViewById<SeekBar>(R.id.seekBar2)

        var sw1 = findViewById<Switch>(R.id.switch1)

        var sw2 = findViewById<Switch>(R.id.switch3)

        var sw3 = findViewById<Switch>(R.id.switch4)

        var sw4 = findViewById<Switch>(R.id.switch5)

        var sw5 = findViewById<Switch>(R.id.switch6)

        var sw6 = findViewById<Switch>(R.id.switch7)

        var sw7 = findViewById<Switch>(R.id.switch8)

        var sw8 = findViewById<Switch>(R.id.switch9)

        var sw9 = findViewById<Switch>(R.id.switch10)

        var sw10 = findViewById<Switch>(R.id.switch11)

        var sw11 = findViewById<Switch>(R.id.switch12)

        var sw12 = findViewById<Switch>(R.id.switch13)
        var edittextt = findViewById<EditText>(R.id.editTextTextPersonName)

        var seek1_x=0
        var seek2_y=0
        var total=""

        if(corbasecim == "Ezogelin")
        {
            sw4.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Düğün")
        {
            sw4.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Mercimek")
        {
            sw4.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Brokoli")
        {
            sw3.visibility = View.VISIBLE
        }
        else if(corbasecim == "Kelle-Paça")
        {
            sw1.visibility = View.VISIBLE
            sw6.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw9.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
        }
        else if(corbasecim == "Yayla")
        {
            sw4.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Şehriye")
        {
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Domates")
        {
            sw2.visibility = View.VISIBLE
            sw4.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Tarhana")
        {
            sw7.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else if(corbasecim == "Mantar")
        {
            sw3.visibility = View.VISIBLE
        }
        else if(corbasecim == "İşkembe")
        {
            sw1.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        else
        {
            sw3.visibility = View.VISIBLE
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
        }

        seek1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                seek2_y = p1
                if(p1==2)
                {
                    val uyari = AlertDialog.Builder(this@third)
                    uyari.setTitle("uyarı!")
                    uyari.setMessage("Bu kadar acili olmasindan emin misiniz? $total")
                    uyari.setIcon(R.drawable.harf_logo)
                    uyari.setPositiveButton("EVET"){DialogInterface, i->
                        Toast.makeText(applicationContext,"bol acili çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır"){DialogInterface, i->
                        seek1.progress = 1
                    }
                    uyari.create().show()
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seek2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                seek1_x = p1
                if(p1==2)
                {
                    val uyari = AlertDialog.Builder(this@third)
                    uyari.setTitle("uyarı!!!")
                    uyari.setMessage("bu kadar tuzlu olmasindan emin misiniz? $total")
                    uyari.setIcon(R.drawable.harf_logo)
                    uyari.setPositiveButton("EVET"){DialogInterface, i->
                        Toast.makeText(applicationContext,"bol tuzlu çorba", Toast.LENGTH_SHORT).show()
                    }
                    uyari.setNegativeButton("Hayır"){DialogInterface, i->
                        seek2.progress = 1
                    }
                    uyari.create().show()
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })
        corbaview.text = "$corbasecim Çorbası"


        siparis.setOnClickListener {
            if (sw1.isChecked ==true)
            {
                total="$total"+sw1.text+","
            }
            if (sw2.isChecked ==true)
            {
                total="$total"+sw2.text+","
            }
            if (sw3.isChecked ==true)
            {
                total="$total"+sw3.text+", "
            }
            if (sw4.isChecked ==true)
            {
                total="$total"+sw4.text+","
            }
            if (sw5.isChecked ==true)
            {
                total="$total"+sw5.text+","
            }
            if (sw6.isChecked ==true)
            {
                total="$total"+sw6.text+","
            }
            if (sw7.isChecked ==true)
            {
                total="$total"+sw7.text+","
            }
            if (sw8.isChecked ==true)
            {
                total="$total"+sw8.text+","
            }
            if (sw9.isChecked ==true)
            {
                total="$total"+sw9.text+","
            }
            if (sw10.isChecked ==true)
            {
                total="$total"+sw10.text+","
            }
            if (sw11.isChecked ==true)
            {
                total="$total"+sw11.text+","
            }
            if (sw12.isChecked ==true)
            {
                total="$total"+sw12.text+","
            }



            val uyari = AlertDialog.Builder(this)

            uyari.setTitle("siparişinizin durumu")

            uyari.setMessage("siparişiniz hazırlanacak devam etmek istiyor musunuz")

            uyari.setIcon(R.drawable.harf_logo)

            uyari.setPositiveButton("evet"){DialogInterface, i->

                var x = Intent(applicationContext, fourth::class.java)

                x.putExtra("corbasecim",corbasecim)

                x.putExtra("seek2",seek1_x.toString())

                x.putExtra("seek1",seek2_y.toString())

                x.putExtra("total",total)

                x.putExtra("extra",edittextt.text.toString())

                startActivity(x)
                total=""
                finish()
            }
            uyari.setNeutralButton("terar dene"){DialogInterface,i->
                total=""
            }
            uyari.show()
        }
    }
}