package jp.techacademy.konomi.sugiura.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            showTimePickerDialog()
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour:Int, minute ->
                if(hour > 17){
                textView.text = "こんばんは"
                } else if(hour > 9){
                    textView.text = "こんにちは"
                } else if(hour > 1){
                    textView.text = "おはよう"
                } else{
                    textView.text = "こんばんは"
                }
            },
            13, 0, true
        )

        timePickerDialog.show()
    }
}
