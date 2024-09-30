package com.example.alertdialogue

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val a= arrayOf("Kotlin", "Java", "Flutter", "Python")
        val b= arrayOf("kotlin", "Jetpack", "firebase", "laravel")
        binding.q1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is your favourite language?")
            builder1.setSingleChoiceItems(a, 0, DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You clicked on ${a[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit") { dialog, which ->
                dialog.dismiss()
            }
            builder1.setNegativeButton("Cancel") { dialog, which ->
                dialog.dismiss()

        }
            builder1.show()
        }
        binding.q2.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What are the core components of Android development")
            builder1.setMultiChoiceItems(b, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this, "You clicked on ${b[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit") { dialog, which ->
                dialog.dismiss()
            }
            builder1.setNegativeButton("Cancel") { dialog, which ->
                dialog.dismiss()

            }
            builder1.show()
        }
        binding.q3.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("What is the full form of API")
            builder1.setMessage("API stands for Application Programming Interface")
            builder1.setPositiveButton("Submit") { dialog, which ->
                dialog.dismiss()
            }
            builder1.setNegativeButton("Cancel") { dialog, which ->
                dialog.dismiss()


    }
            builder1.show()
}
        binding.quit.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are you sure ?")
            builder1.setMessage("Do you want to exit the app")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)

            builder1.setPositiveButton("Yes") { dialog, which ->
                finish()
            }
            builder1.setNegativeButton("No") { dialog, which ->
                dialog.dismiss()
            }
            builder1.show()


        }

    }
}

