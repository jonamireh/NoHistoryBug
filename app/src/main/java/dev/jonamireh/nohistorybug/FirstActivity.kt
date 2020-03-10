package dev.jonamireh.nohistorybug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        action_second_activity.setOnClickListener {
            startActivity(Intent(it.context, SecondActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("NO_HIST FIRST_ACTIVITY", "onDestroy called!")
    }
}
