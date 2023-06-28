package com.example.l3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.l3_6.databinding.FragmentSecondBinding


class SecondFragment : Fragment(), onitemClickListener{

    private lateinit var binding: FragmentSecondBinding

    private val  musicList = arrayListOf(
        Music("3:22", "Элджей", "1" , "Минимал"),
        Music("2:29", "Gafur jony", "2" , "Lollipop"),
        Music("3:02", "Нурминский", "3" , "Валим на гелике"),
        Music("3:57", "Eminem", "4" , "Killer"),
        Music("3:16", "Artik Asti", "5" , "Лампочки"),
        Music("4:16", "Мираж", "6" , "Ты словно тень"),
        Music("2:00", "Instasamka", "7" , "Juicy"),
        Music("3:45", "Kazka", "8" , "Плакала"),
        Music("4:38", "Мираж", "9" , "Музыка нас связала"),
        Music("2:20", "Dinat", "10" , "Девочка Шанель")

    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList)
        binding.rvMusic.adapter = adapter

    }

    override fun onItemClick(position: Int) {
        var bundle: Bundle = Bundle()
        bundle.putInt("name", position)
        var detailFragment: DetailFragment = DetailFragment()
        detailFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.second_container, detailFragment)
    }



}