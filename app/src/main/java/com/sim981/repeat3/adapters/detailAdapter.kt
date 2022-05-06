package com.sim981.repeat3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.sim981.repeat3.R
import com.sim981.repeat3.models.detailListData

class detailAdapter (
    val dContext : Context,
    val dResId : Int,
    val dList : ArrayList<detailListData>,
        ) : ArrayAdapter<detailListData>(dContext, dResId, dList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var dTempRow = convertView
        if(dTempRow == null) {
            dTempRow = LayoutInflater.from(dContext).inflate(R.layout.detail_list_item, null)
        }
        var dRow = dTempRow!!

        val detailNum = dRow.findViewById<TextView>(R.id.listNumTxt)
        val detailTxt = dRow.findViewById<TextView>(R.id.listItemTxt)

        detailNum.text = dList[position].detailNum.toString()
        detailTxt.text = dList[position].detailItem

        return dRow
    }
}