package com.example.motiontoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import com.example.motiontoast.databinding.ActivityMainBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.button1?.setOnClickListener{
            MotionToast.createToast(this,"Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button2?.setOnClickListener{
            MotionToast.createToast(this,
                "Failed ☹️",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button3?.setOnClickListener{
            MotionToast.createToast(this,
                "Please fill all the details!",
                "Profile Update Failed!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button4?.setOnClickListener{
            MotionToast.createToast(this,
                "\"This is information toast!\"️",
                "Profile Update Failed!",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button5?.setOnClickListener{
            MotionToast.createToast(this,
                "\"Delete all history!\"",
                "Profile Update Failed!",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button6?.setOnClickListener{
            MotionToast.createColorToast(this,
                "Hurray success \uD83D\uDE0D",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button7?.setOnClickListener{
            MotionToast.createColorToast(this,
                "Failed ☹️",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button8?.setOnClickListener{
            MotionToast.createColorToast(this,
                "\"Please fill all the details!\"️",
                "Profile Update Failed!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button9?.setOnClickListener{
            MotionToast.createColorToast(this,
                "\"This is information toast!\"️",
                "Profile Update Failed!",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button10?.setOnClickListener{
            MotionToast.createColorToast(this,
                "\"Delete all history!\"",
                "Profile Update Failed!",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button11?.setOnClickListener{
            MotionToast.darkToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button12?.setOnClickListener{
            MotionToast.darkToast(this,
                "Failed ☹️",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button13?.setOnClickListener{
            MotionToast.darkToast(this,
                "Please fill all the details!",
                "Profile Update Failed!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button14?.setOnClickListener{
            MotionToast.darkToast(this,
                "This is information toast!",
                "Profile Update Failed!",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button15?.setOnClickListener{
            MotionToast.darkToast(this,
                "\"Delete all history!\"️",
                "Profile Update Failed!",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button16?.setOnClickListener{
            MotionToast.darkColorToast(this,
                "Hurray success 😍",
                "Upload Completed successfully!",
                MotionToastStyle.SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button17?.setOnClickListener{
            MotionToast.darkColorToast(this,
                "Failed ☹️",
                "Profile Update Failed!",
                MotionToastStyle.ERROR,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button18?.setOnClickListener{
            MotionToast.darkColorToast(this,
                "Please fill all the details!",
                "Profile Update Failed!",
                MotionToastStyle.WARNING,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button19?.setOnClickListener{
            MotionToast.darkColorToast(this,
                "This is information toast!",
                "Profile Update Failed!",
                MotionToastStyle.INFO,
                MotionToast.GRAVITY_CENTER,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }
        binding?.button20?.setOnClickListener{
            MotionToast.darkColorToast(this,
                "\"Delete all history!\"️",
                "Profile Update Failed!",
                MotionToastStyle.DELETE,
                MotionToast.GRAVITY_TOP,
                MotionToast.LONG_DURATION,
                ResourcesCompat.getFont(this,www.sanju.motiontoast.R.font.helvetica_regular))
        }












    }


}