package com.nestorcalvo.fragmentos


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_datos.view.*
import kotlinx.android.synthetic.main.fragment_form.view.*


class DatosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_datos, container, false)


        var nombre = arguments?.getString("nombre")
        val cedula = arguments?.getString("cedula")


        view.tvNombre.text = nombre
        view.tvCedula.text = cedula



        return view
    }



}
