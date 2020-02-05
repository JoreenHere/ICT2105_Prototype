package com.ict2105.ict2105_prototype.ui.organization

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ict2105.ict2105_prototype.R


class CharityOrganizationFragment : Fragment() {

    companion object {
        fun newInstance() =
            CharityOrganizationFragment()
    }

    private lateinit var viewModel: CharityOrganizationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_charity_organization, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CharityOrganizationViewModel::class.java)
        // TODO: Use the ViewModel
    }


}
