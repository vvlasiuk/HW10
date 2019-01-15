package net.ukr.vlsv.hw10.viewmodels

import android.app.Application
import net.ukr.vlsv.hw10.adapter.RecyclerAdapter
import net.ukr.vlsv.hw10.data.Users

class GitHubViewModel(application: Application): BaseViewModel(application) {
    lateinit var gitHubAdapter: RecyclerAdapter
    init {
        gitHubAdapter = RecyclerAdapter(Users("", "").getUsers())

    }


}