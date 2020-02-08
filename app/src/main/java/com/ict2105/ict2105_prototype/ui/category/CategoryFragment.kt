package com.ict2105.ict2105_prototype.ui.category

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.ict2105.ict2105_prototype.AddItemDetailsActivity
import com.ict2105.ict2105_prototype.R


class CategoryFragment : Fragment() {

    companion object {
        fun newInstance() =
            CategoryFragment()
    }

    private lateinit var viewModel: CategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_category, container, false)
//        val imageV: ImageView = root.findViewById(R.id.imageView2)
//        val cardView:CardView = root.findViewById(R.id.bookCard)
//        cardView.setOnClickListener {
//            imageV.visibility = View.INVISIBLE
//        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CategoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
