package com.ict2105.ict2105_prototype.ui.organization

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ict2105.ict2105_prototype.ItemListAdapter
import com.ict2105.ict2105_prototype.OrganizationListAdapter
import com.ict2105.ict2105_prototype.R


class CharityOrganizationFragment : Fragment() {

    companion object {
        fun newInstance() =
            CharityOrganizationFragment()
    }

    private lateinit var viewModel: CharityOrganizationViewModel
    private lateinit var recyclerViewItemList: RecyclerView
    private val organizationList: ArrayList<String> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        organizationList.add("The Salvation Army")
        organizationList.add("The Salvation Army")
        organizationList.add("The Salvation Army")
        organizationList.add("The Salvation Army")
        organizationList.add("The Salvation Army")

        val root: View = inflater.inflate(R.layout.fragment_charity_organization, container, false)
        recyclerViewItemList = root.findViewById(R.id.recyclerViewOrganizationList)
        recyclerViewItemList.layoutManager = LinearLayoutManager(activity)
        recyclerViewItemList.adapter = OrganizationListAdapter(organizationList, root.context)

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CharityOrganizationViewModel::class.java)
        // TODO: Use the ViewModel
    }


}
