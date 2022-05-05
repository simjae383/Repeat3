package com.sim981.repeat3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sim981.repeat3.adapters.intentAdapter
import com.sim981.repeat3.models.intentListData

class MainActivity : AppCompatActivity() {
    val mIntentList = ArrayList<intentListData>()

    lateinit var mIntentAdapter : intentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))
        mIntentList.add(intentListData("심재혁", "sim981", 12345, "동대문구"))

        mIntentAdapter = intentAdapter(this,R.layout.intent_list_item, mIntentList)

    }
}