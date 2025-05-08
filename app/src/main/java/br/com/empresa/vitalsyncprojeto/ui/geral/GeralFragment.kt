
package br.com.empresa.vitalsyncprojeto.ui.geral

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.empresa.vitalsyncprojeto.databinding.FragmentGeralBinding
import br.com.empresa.vitalsyncprojeto.R

class GeralFragment : Fragment() {

    private var _binding: FragmentGeralBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_geral,container,false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}