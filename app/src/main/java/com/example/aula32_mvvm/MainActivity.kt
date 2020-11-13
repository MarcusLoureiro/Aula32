package com.example.aula32_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var tool: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        viewModel.soma.observe(this, Observer {
            tvRes.text = it.toString()
        })

        fbIncrement.setOnClickListener {
            viewModel.incremento(1)
        }

        toolbar.setNavigationOnClickListener {
            viewModel.refresh()

        }
    }
}