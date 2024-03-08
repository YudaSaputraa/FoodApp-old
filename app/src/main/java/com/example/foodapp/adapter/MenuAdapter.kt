package com.example.foodapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.ItemMenuBinding
import com.example.foodapp.model.Menu

class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
private val data = mutableListOf<Menu>()

    fun submitData (items : List<Menu>){
        data.addAll(items)
    }

    class MenuViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Menu) {
            binding.ivMenuImage.setImageResource(item.image)
            binding.tvMenuName.text = item.name
            binding.tvMenuPrice.text = "Rp${item.price}"
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
     holder.bind(data[position])
    }
}