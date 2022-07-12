package br.com.daniel.cartaovisitas.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.daniel.cartaovisitas.data.BusinessCard
import br.com.daniel.cartaovisitas.data.BusinessCardRepository

class BusinessCardViewModel(private val businessCardRepository: BusinessCardRepository) :
    ViewModel() {

    fun insert(businessCard: BusinessCard) {
        businessCardRepository.insert(businessCard)
    }

    fun getAll(): LiveData<List<BusinessCard>> {
        return businessCardRepository.getAll()
    }
}

class BusinessCardViewModelFactory(private val repository: BusinessCardRepository) :
    ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(BusinessCardViewModel::class.java)) {
            return BusinessCardViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}