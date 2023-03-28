package com.example.pruebaanimaciones

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.view.isVisible
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieCompositionFactory
import com.airbnb.lottie.LottieConfig
import com.airbnb.lottie.LottieOnCompositionLoadedListener
import com.airbnb.lottie.model.LottieCompositionCache
import com.airbnb.lottie.parser.LottieCompositionMoshiParser
import com.example.pruebaanimaciones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        Para añadir animación, arrastrar archivo .json a carpeta raw (el nombre solo puede tener minúsculas, _ o números)
        Luego poner el nombre del archivo siguiendo el formato dentro de cada botón y borrar los //.

        En caso de tener que probar más animaciones, recomiendo reemplazar el nombre del archivo dentro de
        un botón ya hecho, es más rápido que crear un nuevo botón desde 0.
         */

        binding.button.setOnClickListener {

            binding.animationView.setAnimation(R.raw.animation_test)
            binding.animationView.playAnimation()
        }

        binding.button2.setOnClickListener {

            binding.animationView.setAnimation(R.raw.animation_test2)
            binding.animationView.playAnimation()
        }

        binding.button3.setOnClickListener {

            binding.animationView.setAnimation(R.raw.animation_test3)
            binding.animationView.playAnimation()
        }

        binding.button4.setOnClickListener {

            //binding.animationView.setAnimation(R.raw.nombreArchivo)
            binding.animationView.playAnimation()
        }

        binding.button5.setOnClickListener {

            //binding.animationView.setAnimation(R.raw.nombreArchivo)
            binding.animationView.playAnimation()
        }

        binding.button6.setOnClickListener {

            //binding.animationView.setAnimation(R.raw.nombreArchivo)
            binding.animationView.playAnimation()
        }

    }

}