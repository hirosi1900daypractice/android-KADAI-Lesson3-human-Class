package jp.techachademy.hiroshi.lesson3kadaihuman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human1=Human("tom",21,"テニス")
        human1.say()
        human1.think()

        var human2=Human("risa",22,"music")
        human2.say()
        human2.think()


    }
}