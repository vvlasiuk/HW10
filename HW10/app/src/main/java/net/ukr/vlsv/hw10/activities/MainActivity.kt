package net.ukr.vlsv.hw10.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import net.ukr.vlsv.hw10.R
import net.ukr.vlsv.hw10.adapter.SpacesItemDecoration
import net.ukr.vlsv.hw10.repository.Repository
import net.ukr.vlsv.hw10.viewmodels.GitHubViewModel
import net.ukr.vlsv.hw10.viewmodels.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var gitHubViewModel: GitHubViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gitHubViewModel = ViewModelProviders.of(this, ViewModelFactory(application)).get(GitHubViewModel::class.java)

        studentsRecyclerView.setHasFixedSize(true)                               // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
        studentsRecyclerView.layoutManager = LinearLayoutManager(this)           // используем linear layout manager
        studentsRecyclerView.addItemDecoration(SpacesItemDecoration(15))
        studentsRecyclerView.adapter = gitHubViewModel.gitHubAdapter
    }
}


