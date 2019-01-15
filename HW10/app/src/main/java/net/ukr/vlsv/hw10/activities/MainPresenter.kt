package net.ukr.vlsv.hw10.activities

import net.ukr.vlsv.hw10.model.GitHubResponse
import net.ukr.vlsv.hw10.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(
    private val repository: Repository,
    val view: MainView
) {
    fun fetchUserDetail(userName: String) {
        repository.getData(userName).enqueue(object : Callback<GitHubResponse> {
            override fun onResponse(
                call: Call<GitHubResponse>,
                response: Response<GitHubResponse>
            ) {
                if (response.isSuccessful) {
                    view.showUserDetail(response.body()!!)
                }
            }
            override fun onFailure(call: Call<GitHubResponse>, t: Throwable) {
            }
        })
    }
}