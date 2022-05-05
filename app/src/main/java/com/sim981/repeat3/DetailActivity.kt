package com.sim981.repeat3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.sim981.repeat3.adapters.detailAdapter
import com.sim981.repeat3.models.detailListData
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    val mDetailList = ArrayList<detailListData>()

    lateinit var mDetailAdapter : detailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val contextName = intent.getStringExtra("namePackage")
        val contextNick = intent.getStringExtra("nickPackage")
        val contextNum = intent.getIntExtra("numPackage")
        val contextAddr = intent.getStringExtra("addrPackage")

        mDetailList.add(detailListData(1, contextName.toString()))
        mDetailList.add(detailListData(2, contextNick.toString()))
        mDetailList.add(detailListData(3, contextNum.toString()))
        mDetailList.add(detailListData(4, contextAddr.toString()))

        mDetailAdapter = detailAdapter(this,R.layout.detail_list_item,detailListData)
        detailListView.adapter = detailAdapter

    }
}