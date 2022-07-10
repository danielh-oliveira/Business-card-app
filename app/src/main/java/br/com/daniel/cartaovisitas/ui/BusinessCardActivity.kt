package br.com.daniel.cartaovisitas.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import br.com.daniel.cartaovisitas.databinding.ActivityBusinessCardBinding


class BusinessCardActivity : AppCompatActivity() {
    private val binding: ActivityBusinessCardBinding by lazy { ActivityBusinessCardBinding.inflate(LayoutInflater.from(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}