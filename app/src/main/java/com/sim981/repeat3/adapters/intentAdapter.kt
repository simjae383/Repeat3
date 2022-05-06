package com.sim981.repeat3.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.sim981.repeat3.R
import com.sim981.repeat3.models.intentListData

class intentAdapter (
    val iContext : Context,
    val iResId : Int,
    val iList : ArrayList<intentListData>
        ) : ArrayAdapter<intentListData>(iContext,iResId,iList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var iTempRow = convertView
        if(iTempRow == null) {
            iTempRow = LayoutInflater.from(iContext).inflate(R.layout.intent_list_item, null)
        }
        var iRow = iTempRow!!

        val iNameTxt = iRow.findViewById<TextView>(R.id.nameItemTxt)
        val iNickTxt = iRow.findViewById<TextView>(R.id.nickItemTxt)
        val iNumTxt = iRow.findViewById<TextView>(R.id.numItemTxt)
        val iAddrTxt = iRow.findViewById<TextView>(R.id.addrItemTxt)

        iNameTxt.text = iList[position].itemName
        iNickTxt.text = iList[position].itemNick
        iNumTxt.text = iList[position].itemNumber.toString()
        iAddrTxt.text = iList[position].itemAddr

        return iRow
    }

}