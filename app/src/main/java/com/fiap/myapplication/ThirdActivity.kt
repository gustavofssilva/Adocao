package com.fiap.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fiap.myapplication.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityThirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.choraoPhoto.setOnClickListener {


            val navegarChorao = Intent(this,ChoraoActivity::class.java)
            startActivity(navegarChorao)

        }

        binding.robertoPhoto.setOnClickListener {


            val navegarRoberto = Intent(this,RobertoActivity::class.java)
            startActivity(navegarRoberto)

        }

        binding.pitangaPhoto.setOnClickListener {


            val navegarPitanga = Intent(this,PitangaActivity::class.java)
            startActivity(navegarPitanga)

        }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}