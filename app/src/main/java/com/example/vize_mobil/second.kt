package com.example.vize_mobil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var check=findViewById<CheckBox>(R.id.checkBox)
        var grup=findViewById<RadioGroup>(R.id.radioGroup)
        var dugme=findViewById<Button>(R.id.button3)

        dugme.visibility= View.INVISIBLE

        check.setOnCheckedChangeListener { compoundButton, b ->

            if (b){
                grup.visibility= View.VISIBLE
                dugme.visibility= View.VISIBLE
            }
            else{
                grup.visibility= View.INVISIBLE
                dugme.visibility= View.INVISIBLE
            }

        }


        dugme.setOnClickListener {



            var selectSoup=findViewById<RadioButton>(grup.checkedRadioButtonId)

            if (selectSoup==null){
                val uyari= AlertDialog.Builder(this)
                uyari.setTitle("uyari!")
                uyari.setMessage("lütfen seçim yapınız...")
                uyari.setIcon(R.drawable.harf_logo)
                uyari.setNeutralButton("TEKRAR DENE"){DialogInterface,i->
                }
                uyari.create().show()


            }
            else{
                var tasarim=layoutInflater.inflate(R.layout.yenitoast2,null)

                var tasarimdevm=tasarim.findViewById<TextView>(R.id.textView7)
                tasarimdevm.text=" ${selectSoup.text} Çorbası \n Güzel seçim \n" +
                        "  Lütfen Bekleyiniz "
                var tost_ozel= Toast(applicationContext)
                tost_ozel.view=tasarim
                tost_ozel.duration= Toast.LENGTH_SHORT
                tost_ozel.show()

                Handler().postDelayed({
                    var x= Intent(this,third::class.java)
                    x.putExtra("corba",selectSoup.text)
                    startActivity(x)
                    finish()

                },2000)

            }

        }
    }
}