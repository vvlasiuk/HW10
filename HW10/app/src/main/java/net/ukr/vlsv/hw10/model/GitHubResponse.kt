package net.ukr.vlsv.hw10.model

import com.google.gson.annotations.SerializedName

data class GitHubResponse (
    @SerializedName("name") val name: String,
    @SerializedName("id") val id: Int,
    @SerializedName("login") val nickname: String,
    @SerializedName("public_repos") val numberRepositories: Int,
    @SerializedName("public_gists") val numberGists: Int,
    @SerializedName("followers") val followersCount: Int,
    @SerializedName("following") val followingCount: Int,
    @SerializedName("avatar_url") val photoUrl: String,
    @SerializedName("html_url") val pageUrl: String
)