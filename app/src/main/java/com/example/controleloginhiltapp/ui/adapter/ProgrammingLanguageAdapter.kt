package com.example.controleloginhiltapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.controleloginhiltapp.data.model.ProgrammingLanguage
import com.example.controleloginhiltapp.databinding.ItemProgrammingLanguageBinding


val DIFF_UTIL = object : DiffUtil.ItemCallback<ProgrammingLanguage>() {
    override fun areItemsTheSame(
        oldItem: ProgrammingLanguage,
        newItem: ProgrammingLanguage,
    ): Boolean {
        return oldItem == newItem
    }
    
    override fun areContentsTheSame(
        oldItem: ProgrammingLanguage,
        newItem: ProgrammingLanguage,
    ): Boolean {
        return oldItem.name == newItem.name
    }
}

class ProgrammingLanguageAdapter(
    programmingLanguageList: List<ProgrammingLanguage> = emptyList()
) :
    ListAdapter<ProgrammingLanguage, ProgrammingLanguageAdapter.ViewHolder>(DIFF_UTIL) {
    
    init {
        if (programmingLanguageList.isNotEmpty())
            this.submitList(programmingLanguageList)
    }
    
    class ViewHolder(private val itemBinding: ItemProgrammingLanguageBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        
        fun bind(item: ProgrammingLanguage) {
            with(itemBinding) {
                tvProgrammingLanguageName.text = item.name
                Glide.with(itemBinding.root).load(item.imageUrl).into(ivProgrammingLanguageImage)
                this.root.setOnClickListener {
                    Toast.makeText(itemBinding.root.context, "${item.name} selecionado!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProgrammingLanguageBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}