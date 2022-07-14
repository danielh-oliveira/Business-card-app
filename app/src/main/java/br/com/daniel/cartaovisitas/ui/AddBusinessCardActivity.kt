package br.com.daniel.cartaovisitas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.daniel.cartaovisitas.App
import br.com.daniel.cartaovisitas.R
import br.com.daniel.cartaovisitas.data.BusinessCard
import br.com.daniel.cartaovisitas.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private val binding: ActivityAddBusinessCardBinding by lazy { ActivityAddBusinessCardBinding.inflate(LayoutInflater.from(this)) }
    private val businessCardViewModel: BusinessCardViewModel by viewModels {
        BusinessCardViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        insertListeners()
    }

    private fun insertListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener {
            val businessCard = BusinessCard(
                name = binding.tilName.editText?.text.toString(),
                company = binding.tilCompany.editText?.text.toString(),
                cellphone = binding.tilCellphone.editText?.text.toString(),
                email = binding.tilEmail.editText?.text.toString(),
                background = binding.tilColor.editText?.text.toString().uppercase()
            )
            businessCardViewModel.insert(businessCard)
            Toast.makeText(this, R.string.confirm_show_success, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}