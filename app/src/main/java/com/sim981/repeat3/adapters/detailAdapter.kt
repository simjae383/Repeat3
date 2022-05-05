package com.sim981.repeat3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.sim981.repeat3.R
import com.sim981.repeat3.models.detailListData
import com.sim981.repeat3.models.intentListData
import java.text.DecimalFormat

class detailAdapter (
    val dContext : Context,
    val dResId : Int,
    val dList : ArrayList<detailListData>,
    val iList : ArrayList<intentListData>
        ) : ArrayAdapter<detailListData>(dContext, dResId, dList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var dTempRow = convertView
        if(dTempRow == null)
            dTempRow = LayoutInflater.from(dContext).inflate(R.layout.detail_list_item,null)
        var dRow = dTempRow!!

        val dNameTxt = dRow.findViewById<TextView>(R.id.nameItemTxt)
        val dNickTxt = dRow.findViewById<TextView>(R.id.nickItemTxt)
        val dNumTxt = dRow.findViewById<TextView>(R.id.numItemTxt)
        val dAddrTxt = dRow.findViewById<TextView>(R.id.addrItemTxt)

        val decimal = DecimalFormat("##,###")
        val resultNum = decimal.format(iList[position].itemNumber)

        dNameTxt.text = iList[position].itemName
        dNickTxt.text = iList[position].itemNick
        dNumTxt.text = resultNum
        dAddrTxt.text = iList[position].itemAddr

        return dRow
    }
}