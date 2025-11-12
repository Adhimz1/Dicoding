package com.pab.dicoding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pab.dicoding.databinding.ItemRowPlayerBinding

class ListPlayerAdapter(private val listPlayer: ArrayList<Player>) : RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowPlayerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val player = listPlayer[position]
        Glide.with(holder.itemView.context)
            .load(player.photo)
            .into(holder.binding.imgItemPhoto)
        holder.binding.tvItemName.text = player.name
        holder.binding.tvItemDescription.text = player.overview

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPlayer[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int = listPlayer.size

    class ListViewHolder(var binding: ItemRowPlayerBinding) : RecyclerView.ViewHolder(binding.root)

    interface OnItemClickCallback {
        fun onItemClicked(data: Player)
    }
}