package me.wasir.android.dev.presentation.home

import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import dagger.hilt.android.AndroidEntryPoint
import me.wasir.android.dev.databinding.FragmentHomeBinding
import me.wasir.android.dev.presentation.base.BaseFragment
@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var binding: FragmentHomeBinding
    private val homeViewModel: HomeViewModel by viewModels()
    override fun onInflateView(): ViewBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onViewInflated(viewBinding: ViewBinding) {
        binding = viewBinding as FragmentHomeBinding
        homeViewModel.getNewsHeadLines()
    }

}