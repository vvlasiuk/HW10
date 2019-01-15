package net.ukr.vlsv.hw10.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//@Inject constructor
class ViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = when {
        modelClass.isAssignableFrom(GitHubViewModel::class.java) -> {
            GitHubViewModel(application = application) as T
        }
        else -> throw IllegalArgumentException()
    }
}