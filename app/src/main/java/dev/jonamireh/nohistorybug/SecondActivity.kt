package dev.jonamireh.nohistorybug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        action_third_activity.setOnClickListener {
            startActivity(Intent(it.context, ThirdActivity::class.java))
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("NO_HIST SECOND_ACTIVITY", "onDestroy called!")
    }
}
