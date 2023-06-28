package com.example.l3_6


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.l3_6.databinding.ItemTrecBinding

class MusicAdapter(
    val list: ArrayList<Music> ,

    ) : Adapter<MusicAdapter.ViewHolder>() {
    private lateinit var onitemClickListener: onitemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemTrecBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()

    }

    inner class ViewHolder(private val binding: ItemTrecBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = list[adapterPosition]
            binding.apply {
                item.apply {
                    tvTrec.text = name
                    tvAvtor.text = avtor
                    tvNumber.text = nomer
                    tvTime.text = time
                    itemView.setOnClickListener {
                        onitemClickListener.onItemClick(position)
                    }
                }

            }


        }
    }

}