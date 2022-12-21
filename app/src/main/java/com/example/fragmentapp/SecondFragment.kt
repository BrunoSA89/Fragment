package com.example.fragmentapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
// visualizacao esta sendo criada - ele salva o momento que vc estava no app
// tipos costumizados

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
// quando a vizualicao nao esta em tela e acabou de ser criada


    /*override fun onStart() {
        super.onStart()
    }

// da star na visualizacao e poe na tela

    override fun onPause() {
        super.onPause()
    }

// pausa a vizualizacao/ coloca-se louding

    override fun onStop() {
        super.onStop()
    }

// para a vizualizacao e interacao do usuario

    override fun onDestroyView() {
        super.onDestroyView()
    }

// destroi a vizualizacao

    override fun onDestroy() {
        super.onDestroy()
    }

// destroi o fragmente e tira a amain activity

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

// acionado quando se tem um estado de instancia salvo*/



}