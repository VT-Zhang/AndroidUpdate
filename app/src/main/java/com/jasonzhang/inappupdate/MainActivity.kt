package com.jasonzhang.inappupdate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btForceUpdate.setOnClickListener {
            startActivity(ForceUpdateDemoActivity.newIntent(this))
        }

        btUpdateType.setOnClickListener {
            startActivity(UpdateTypeDemoActivity.newIntent(this))
        }
    }
}