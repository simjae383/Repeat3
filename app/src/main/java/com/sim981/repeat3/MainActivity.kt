package com.sim981.repeat3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sim981.repeat3.adapters.intentAdapter
import com.sim981.repeat3.models.intentListData
import kotlinx.android.synthetic.main.activity_main.*

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
        intentListView.adapter = mIntentAdapter

        intentListView.setOnItemClickListener { adapterView, view, i, l ->
            val goIntent = Intent(this, DetailActivity::class.java)
            val namePackage : String = mIntentList[i].itemName
            val nickPackage : String = mIntentList[i].itemNick
            val numPackage : String = mIntentList[i].itemNumber.toString()
            val addrPackage : String = mIntentList[i].itemAddr

            goIntent.putExtra("namePackage",namePackage)
                .putExtra("nickPackage", nickPackage)
                .putExtra("numPackage", numPackage)
                .putExtra("addrPackage", addrPackage)
            startActivity(goIntent)
        }
    }
}