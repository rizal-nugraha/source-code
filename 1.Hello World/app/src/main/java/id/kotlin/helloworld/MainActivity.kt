package id.kotlin.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goodlayout = findViewById<LinearLayout>(R.id.good_layout)
        val btnSnack = findViewById<Button>(R.id.btn_ku_snack)
        btnSnack.setOnClickListener { Snackbar.make(goodlayout, "hello world versi Snack", Snackbar.LENGTH_SHORT).show() }

        val button = findViewById<Button>(R.id.btn_ku)
        button.setOnClickListener { Toast.makeText( this, "hello World", Toast.LENGTH_SHORT).show()}


    }


}