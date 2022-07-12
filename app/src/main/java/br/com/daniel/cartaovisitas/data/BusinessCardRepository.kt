package br.com.daniel.cartaovisitas.data

import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class BusinessCardRepository(private val dao: BusinessCardDao) {

    fun insert(businessCard: BusinessCard) = runBlocking {
        launch(IO) {
            dao.insert(businessCard)
        }
    }

    fun getAll() = dao.getAll()
}