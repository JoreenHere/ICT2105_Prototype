package com.ict2105.ict2105_prototype.ui.Browse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ict2105.ict2105_prototype.ItemListAdapter
import com.ict2105.ict2105_prototype.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BlankFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var recyclerViewItemList: RecyclerView
    private val itemList: ArrayList<String> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root: View = inflater.inflate(R.layout.fragment_browse, container, false)

        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")

        recyclerViewItemList = root.findViewById(R.id.recyclerViewItemList)
        recyclerViewItemList.layoutManager = GridLayoutManager(activity, 2, RecyclerView.VERTICAL, false)
        recyclerViewItemList.adapter = ItemListAdapter(itemList)
        return root
    }
}
