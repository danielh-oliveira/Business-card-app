package br.com.daniel.cartaovisitas.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.daniel.cartaovisitas.App
import br.com.daniel.cartaovisitas.databinding.ActivityBusinessCardBinding


class BusinessCardActivity : AppCompatActivity() {
    private val binding: ActivityBusinessCardBinding by lazy { ActivityBusinessCardBinding.inflate(LayoutInflater.from(this)) }
    private val businessCardViewModel: BusinessCardViewModel by viewModels {
        BusinessCardViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getAllBusinessCards()
        insertListener()
    }

    private fun getAllBusinessCards() {
//        businessCardViewModel.getAll().observe(this, { card ->
//
//        })
    }

    private fun insertListener() {
        binding.floatingActionButton.setOnClickListener {
            val intent = Intent(this, AddBusinessCardActivity::class.java)
            startActivity(intent)
        }
    }
}