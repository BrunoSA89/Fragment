package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            callFistFragment()
            }
        }

    private fun callSecondFragment() {
        TODO("Not yet implemanted")
    }

    private fun callSecondFragment() {
        findViewById<Button>(R.id.fragment2).setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SecondFragment>(R.id.fragmentContainerView)
            }
        }
    }

    private fun callFistFragment() {
        TODO("Not yet implemanted")
    }

    private fun callFistFragment() {
        findViewById<Button>(R.id.fragment1).setOnClickListener {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FistFragment>(R.id.fragmentContainerView)
            }
        }
    }
}