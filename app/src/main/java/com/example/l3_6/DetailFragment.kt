package com.example.l3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.l3_6.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private var  musicList = arrayListOf<Music>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var position = arguments?.getInt("name")
        position?.let { chek(it) }

    }
    fun chek(position: Int){
        var music: Music = Music()
        binding.tvDnumber.text = music.nomer
        binding.tvDavtor.text = music.avtor
        binding.tvDtime.text = music.time
        binding.tvDtrec.text = music.name
        when(position){
            0 -> {

                musicList.add(
                    Music("3:22", "Элджей", "1" , "Минимал")
                )
            }
            1->{
                musicList.add(
                    Music("2:29", "Gafur jony", "2" , "Lollipop")
                )
            }
            2->{
                musicList.add(
                    Music("3:02", "Нурминский", "3" , "Валим на гелике")
                )
            }
            3->{musicList.add(
                Music("3:57", "Eminem", "4" , "Killer")
            )}
            4->{musicList.add(
                Music("3:16", "Artik Asti", "5" , "Лампочки")
            )}
            5->{musicList.add(
                Music("4:16", "Мираж", "6" , "Ты словно тень")
            )}
            6->{musicList.add(
                Music("2:00", "Instasamka", "7" , "Juicy")
            )}
            7->{musicList.add(
                Music("3:45", "Kazka", "8" , "Плакала")
            )}
            8->{musicList.add(
                Music("4:38", "Мираж", "9" , "Музыка нас связала")
            )}
            9->{musicList.add(
                Music("2:20", "Dinat", "10" , "Девочка Шанель")
            )}

        }
    }

}