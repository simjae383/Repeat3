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

        val contextName = intent.getStringExtra("namePackage").toString()
        val contextNick = intent.getStringExtra("nickPackage").toString()
        val contextNum = intent.getStringExtra("numPackage").toString()
        val contextAddr = intent.getStringExtra("addrPackage").toString()

        mDetailList.add(detailListData(1, contextName))
        mDetailList.add(detailListData(2, contextNick))
        mDetailList.add(detailListData(3, contextNum))
        mDetailList.add(detailListData(4, contextAddr))

        mDetailAdapter = detailAdapter(this,R.layout.detail_list_item,mDetailList)
        detailListView.adapter = mDetailAdapter

    }
}