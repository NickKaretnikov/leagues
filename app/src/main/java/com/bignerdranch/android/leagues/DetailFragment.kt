package com.bignerdranch.android.leagues

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bignerdranch.android.leagues.databinding.DetailedFragmentBinding

class DetailFragment : Fragment() {

    private var binding: DetailedFragmentBinding? = null
    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = DetailedFragmentBinding.inflate(inflater, container, false).apply {
        binding = this
        tvDeteiled.text = args.league.name
    }.root


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}