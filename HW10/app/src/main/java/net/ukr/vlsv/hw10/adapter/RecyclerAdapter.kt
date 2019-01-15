package net.ukr.vlsv.hw10.adapter

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_user_item.view.*
import net.ukr.vlsv.hw10.data.Users
import net.ukr.vlsv.hw10.R
import net.ukr.vlsv.hw10.activities.UserDetail

class RecyclerAdapter (private var mDataset: ArrayList<Users>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var listener: ((item: Users) -> Unit)? = null

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        var mUserName: TextView
        var itemUser: Users? = null
        init {
            mUserName = v.findViewById(R.id.userNameTextView) as TextView

            v.setOnClickListener(this)
        }

        fun onBind(user: Users) {
            mUserName.text = user.FullName
            itemUser = user
        }

        override fun onClick(v: View) {
            val intent = Intent(v.context, UserDetail::class.java)
            intent.putExtra("User", itemUser)
            v.context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutResource = getLayout(viewType)
        val view: View = LayoutInflater.from(parent.context).inflate(layoutResource, parent, false)
        return ViewHolder(view)
    }

    private fun getLayout(viewType: Int): Int {
        return R.layout.activity_user_item
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(mDataset[position])
    }

    override fun getItemCount(): Int {
        return mDataset.size
    }

    override fun getItemViewType(position: Int): Int {
        return -1
    }


}