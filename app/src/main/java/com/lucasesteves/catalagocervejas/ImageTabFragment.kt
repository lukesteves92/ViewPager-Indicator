package com.lucasesteves.catalagocervejas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
const val PARAM_NUMBER = "param_number"

class ImageTabFragment : Fragment() {
    private var number: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            number = it.getInt(PARAM_NUMBER)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_image_tab, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when(number){
            0 -> view.findViewById<ImageView>(R.id.imgImageTab).setImageDrawable(
                context?.let { ContextCompat.getDrawable(it, R.drawable.corona) })
            1 -> view.findViewById<ImageView>(R.id.imgImageTab).setImageDrawable(
                context?.let { ContextCompat.getDrawable(it, R.drawable.heineken) })
            2 -> view.findViewById<ImageView>(R.id.imgImageTab).setImageDrawable(
                context?.let { ContextCompat.getDrawable(it, R.drawable.bluemoon) })
            3 -> view.findViewById<ImageView>(R.id.imgImageTab).setImageDrawable(
                context?.let { ContextCompat.getDrawable(it, R.drawable.badenbaden) })
            4 -> view.findViewById<ImageView>(R.id.imgImageTab).setImageDrawable(
                context?.let { ContextCompat.getDrawable(it, R.drawable.hoe) })
        }
    }

    companion object {
        @JvmStatic fun newInstance(param1: Int) =
            ImageTabFragment().apply {
                arguments = Bundle().apply {
                    putInt(PARAM_NUMBER, param1)
                }
            }
    }
}