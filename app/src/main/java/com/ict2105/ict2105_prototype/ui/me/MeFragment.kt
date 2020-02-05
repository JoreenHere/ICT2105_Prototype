package com.ict2105.ict2105_prototype.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ict2105.ict2105_prototype.R

class MeFragment : Fragment() {

    private lateinit var meViewModel: MeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        meViewModel =
            ViewModelProviders.of(this).get(MeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_me, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        meViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}