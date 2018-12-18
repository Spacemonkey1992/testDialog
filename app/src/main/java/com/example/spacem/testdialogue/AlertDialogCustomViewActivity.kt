package com.example.spacem.testdialogue


import android.app.AlertDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.SimpleAdapter
import android.widget.TextView

import java.util.ArrayList
import java.util.HashMap
import android.widget.EditText





class AlertDialogCustomViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_custom_view)

        title = "dev2qa.com --- Custom View Alert Dialog"

        val textView = findViewById<View>(R.id.alertDialogTextView) as TextView

       /* this.showSimpleAdapterAlertDialog(textView)

        this.showCustomViewAlertDialog(textView)*/
    }


    /*// Show how to use SimpleAdapter to customize list item in android alert dialog.
    private fun showSimpleAdapterAlertDialog(textView: TextView) {

        val alertDialogButton = findViewById<View>(R.id.alertDialogCustomAdapterButton) as Button

        alertDialogButton.setOnClickListener(object : View.OnClickListener {

            // Each image in array will be displayed at each item beginning.
            private val imageIdArr = intArrayOf(R.drawable.abc_btn_radio_to_on_mtrl_015, R.drawable.abc_btn_colored_material, R.drawable.abc_btn_radio_material)
            // Each item text.
            private val listItemArr = arrayOf("Candy Cane", "Present", "Snow Man")

            // Image and text item data's key.
            private val CUSTOM_ADAPTER_IMAGE = "image"
            private val CUSTOM_ADAPTER_TEXT = "text"

            override fun onClick(view: View) {
                // Create a alert dialog builder.
                val builder = AlertDialog.Builder(this@AlertDialogCustomViewActivity)
                // Set icon value.
                builder.setIcon(R.mipmap.ic_launcher)
                // Set title value.
                builder.setTitle("Simple Adapter Alert Dialog")

                // Create SimpleAdapter list data.
                val dialogItemList = ArrayList<Map<String, Any>>()
                val listItemLen = listItemArr.size
                for (i in 0 until listItemLen) {
                    val itemMap = HashMap<String, Any>()
                    itemMap[CUSTOM_ADAPTER_IMAGE] = imageIdArr[i]
                    itemMap[CUSTOM_ADAPTER_TEXT] = listItemArr[i]

                    dialogItemList.add(itemMap)
                }

                // Create SimpleAdapter object.
                val simpleAdapter = SimpleAdapter(
                    this@AlertDialogCustomViewActivity, dialogItemList,
                    R.layout.activity_alert_dialog_simple_adapter_row,
                    arrayOf(CUSTOM_ADAPTER_IMAGE, CUSTOM_ADAPTER_TEXT),
                    intArrayOf(R.id.alertDialogItemImageView, R.id.alertDialogItemTextView)
                )

                // Set the data adapter.
                builder.setAdapter(
                    simpleAdapter
                ) { dialogInterface, itemIndex -> textView.text = "You choose item " + listItemArr[itemIndex] }

                builder.setCancelable(false)
                builder.create()
                builder.show()
            }
        })
    }

    // Show how to add custom view in android alert dialog.
    private fun showCustomViewAlertDialog(textView: TextView) {

        val alertDialogButton = findViewById<View>(R.id.alertDialogCustomViewButton) as Button

        alertDialogButton.setOnClickListener(object : View.OnClickListener {

            // Store the created AlertDialog instance.
            // Because only AlertDialog has cancel method.
            private var alertDialog: AlertDialog? = null

            override fun onClick(view: View) {
                // Create a alert dialog builder.
                val builder = AlertDialog.Builder(this@AlertDialogCustomViewActivity)
                // Set icon value.
                builder.setIcon(R.mipmap.ic_launcher)
                // Set title value.
                builder.setTitle("Custom View Alert Dialog")

                // Get custom login form view.
                val n = layoutInflater.inflate(R.layout.activity_alert_dialog_custom_view_login_form, null)
                // Set above view in alert dialog.
                builder.setView(loginFormView)

                // Register button click listener.
                val registerButton = loginFormView.findViewById<View>(R.id.loginFormRegisterButton) as Button
                registerButton.setOnClickListener {
                    try {
                        // Close Alert Dialog.
                        alertDialog!!.cancel()
                        textView.text = "Register success."
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }

                // Login button click listener.
                val loginButton = loginFormView.findViewById<View>(R.id.loginFormLoginButton) as Button
                loginButton.setOnClickListener {
                    try {
                        // Close Alert Dialog.
                        alertDialog!!.cancel()
                        textView.text = "Login success."
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }

                // Reset button click listener.
                val resetButton = loginFormView.findViewById<View>(R.id.loginFormResetButton) as Button
                resetButton.setOnClickListener {
                    try {
                        val loginUserName = loginFormView.findViewById<View>(R.id.loginFormUserName) as EditText
                        val loginPassword = loginFormView.findViewById<View>(R.id.loginFormPassword) as EditText
                        val loginPhoneNumber = loginFormView.findViewById<View>(R.id.loginFormPhoneNumber) as EditText

                        loginUserName.setText("")
                        loginPassword.setText("")
                        loginPhoneNumber.setText("")
                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }

                builder.setCancelable(true)
                alertDialog = builder.create()
                alertDialog!!.show()
            }
        })
    }*/
}