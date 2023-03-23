package com.example.alertdialogboxassigment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogboxassigment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener{
            val options= arrayOf("an operating system","a web browser","a web server","None of the above",)
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("1) Android is -")
            builder1.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You Clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()

        }
        binding.textView2.setOnClickListener {
            val opts = arrayOf("JVM","Dalvik virtual machine","Simple virtual machine","None of the above")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("2) Which of the following virtual machine is used by the Android operating system?")
            builder2.setSingleChoiceItems(opts,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You Clicked on ${opts[which]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder2.show()
        }
        binding.textView3.setOnClickListener {
            val oprts = arrayOf("java","C++","C","None of the above")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("3) Android is based on which of the following language?")
            builder3.setMultiChoiceItems(oprts,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->  })
            builder3.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->  })
            builder3.show()
            binding.button.setOnClickListener {
                val builder4 = AlertDialog.Builder(this)
                builder4.setTitle("Are your sure?")
                builder4.setMessage("Do you want to close the app")
                builder4.setIcon(R.drawable.baseline_exit_to_app_24)
                builder4.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                    finish()
                })
                builder4.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->

                })
                builder4.show()
            }

        }

    }
}