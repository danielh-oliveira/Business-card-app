package br.com.daniel.cartaovisitas.ui

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import br.com.daniel.cartaovisitas.data.BusinessCard

class BusinessCardAdapter: ListAdapter<BusinessCard, BusinessCardAdapter.ViewHolder>(DiffCallback()) {

    var listenerShare: (View) -> Unit = {}

    inner class ViewHolder {

    }
}