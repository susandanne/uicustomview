package com.example.uicusomview.Widgets

import android.content.Context

import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uicusomview.R

class RcvItem: ConstraintLayout {

    lateinit var mLayout:ConstraintLayout
    lateinit var image:ImageView
    lateinit var title:TextView
    lateinit var desc:TextView

    private  var titletext=""
    private  var desctext=""
    private  var ImageID=0

constructor( context: Context) : super(context){
    initview(context)
}



    constructor(context: Context,attrs: AttributeSet) : super(context,attrs){
       getresfromxml(context,attrs)
        initview(context)
    }


    private fun initview(context: Context) {
layoutParams= LayoutParams(
android.view.ViewGroup.LayoutParams.MATCH_PARENT,
android.view.ViewGroup.LayoutParams.WRAP_CONTENT

)


        LayoutInflater.from(context).inflate(R.layout.custom_item,this,false)
        mLayout=findViewById(R.id.mLayout)
        image=findViewById(R.id.img)
        title=findViewById(R.id.texttitle)
        desc=findViewById(R.id.textdesc)

        if (titletext.isEmpty()){
            title.text=titletext
        }

        if (desctext.isEmpty()){
            desc.text=desctext
        }

//        if (ImageID !=0){
//            image.setImageResource(ImageID)
//        }

    }
    private fun getresfromxml(context: Context, attrs: AttributeSet) {
   val data=context.obtainStyledAttributes(attrs,R.styleable.RcvItem)
        titletext=data.getString(R.styleable.RcvItem_Ttext).toString()
        desctext=data.getString(R.styleable.RcvItem_Dtext).toString()
//        ImageID=data.getInteger(R.styleable.RcvItem_src,0)

        data.recycle()
    }

}