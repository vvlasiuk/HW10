package net.ukr.vlsv.hw10.network

import net.ukr.vlsv.hw10.model.GitHubResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface  GitHubService {
    @GET("users/{user}")
    fun getUserDetail(@Path("user") user: String): Call<GitHubResponse>
}