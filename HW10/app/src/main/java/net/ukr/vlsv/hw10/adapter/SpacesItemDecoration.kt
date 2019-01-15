package net.ukr.vlsv.hw10.adapter

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView
import android.view.View

class SpacesItemDecoration(var space: Int): RecyclerView.ItemDecoration() {
    fun SpacesItemDecoration(space: Int)
    {
        this.space = space;
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.bottom = space;

    }
}