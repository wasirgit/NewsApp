package me.wasir.android.dev.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<T> : Fragment() {
    private var viewBinding: ViewBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = onInflateView()
        viewBinding?.let {
            onViewInflated(it)
        }
        return viewBinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

    fun binding(): T = viewBinding as T
    abstract fun onInflateView(): ViewBinding
    abstract fun onViewInflated(viewBinding: ViewBinding)
}