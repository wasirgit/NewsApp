package me.wasir.android.dev.presentation.home

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.viewbinding.ViewBinding
import me.wasir.android.dev.databinding.FragmentHomeBinding
import me.wasir.android.dev.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var binding: FragmentHomeBinding
    private val homeViewModel: HomeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
    override fun onInflateView(): ViewBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onViewInflated(viewBinding: ViewBinding) {
        binding = viewBinding as FragmentHomeBinding
        homeViewModel.getNewsHeadLines()
    }

}