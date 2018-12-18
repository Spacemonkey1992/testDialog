package com.example.spacem.testdialogue

/*import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SimpleAdapter
import android.widget.TextView
import java.util.ArrayList
import java.util.HashMap*/
import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*
import com.example.spacem.testdialogue.R.layout.activity_unit_dialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import java.util.HashMap
import kotlinx.android.synthetic.main.activity_unit_dialog.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val dialogClickListener = DialogInterface.OnClickListener { dialog, which ->
                when (which) {
                    DialogInterface.BUTTON_POSITIVE -> {
                        Toast.makeText(this, "On ajoute la unit !", Toast.LENGTH_LONG).show()
                    }

                    DialogInterface.BUTTON_NEGATIVE -> {
                        Toast.makeText(this, "On n'ajoute pas la unit !", Toast.LENGTH_LONG).show()
                    }
                }
            }
            val builder = android.support.v7.app.AlertDialog.Builder(this)
            builder.setMessage("Voulez vous ajouter la unit?").setNegativeButton("No", dialogClickListener).setPositiveButton("Yes", dialogClickListener)
            builder.setIcon(R.drawable.abc_btn_check_material)
            builder.setTitle("Unit")
            builder.setView(R.layout.activity_unit_dialog)
            builder.show()
        }

    }
}
