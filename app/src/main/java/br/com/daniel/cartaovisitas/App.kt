package br.com.daniel.cartaovisitas

import android.app.Application
import br.com.daniel.cartaovisitas.data.AppDatabase
import br.com.daniel.cartaovisitas.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessCardDao()) }
}