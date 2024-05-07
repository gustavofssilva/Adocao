package com.fiap.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fiap.myapplication.databinding.ActivityMainBinding
import com.fiap.myapplication.databinding.ActivityPitangaBinding

class PitangaActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityPitangaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityPitangaBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)



        binding.setaVoltar.setOnClickListener {


            val navegarTerceiraTela = Intent(this,ThirdActivity::class.java)
            startActivity(navegarTerceiraTela)

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}