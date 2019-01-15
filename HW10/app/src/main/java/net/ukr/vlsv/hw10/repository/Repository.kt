package net.ukr.vlsv.hw10.repository

import net.ukr.vlsv.hw10.model.GitHubResponse
import net.ukr.vlsv.hw10.network.GitHubService
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Repository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val gitHubService = retrofit.create(GitHubService::class.java)

    fun getData(userName: String): Call<GitHubResponse> {
        return gitHubService.getUserDetail(userName)
    }
}