package com.nestorcalvo.fragmentos


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_datos.view.*


class DatosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_datos, container, false)
        var nombre:String? = arguments?.getString("nombre")
        var cedula:String? = arguments?.getString("cedula")

        view.tvNombre.text = nombre
        view.tvCedula.text = cedula

        return view
    }


}
