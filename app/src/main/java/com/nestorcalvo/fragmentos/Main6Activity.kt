package com.nestorcalvo.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Main6Activity : AppCompatActivity(), Comunicador {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val manager = supportFragmentManager
        val transaction:FragmentTransaction = manager.beginTransaction()

        val formFragment = FormFragment()
        transaction.add(R.id.frameLayout, formFragment).commit()

    }

    override fun enviarDatos(nombre: String, cedula: String) {
        val args = Bundle()
        args.putString("nombre",nombre)
        args.putString("cedula",cedula)


        val manager = supportFragmentManager
        val transaction:FragmentTransaction = manager.beginTransaction()

        val datosFragment = DatosFragment()
        datosFragment.arguments = args

        transaction.replace(R.id.frameLayout, datosFragment).commit()


    }

}
