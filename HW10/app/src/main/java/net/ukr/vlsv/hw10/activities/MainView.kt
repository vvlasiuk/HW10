package net.ukr.vlsv.hw10.activities

import net.ukr.vlsv.hw10.model.GitHubResponse

interface MainView {
    fun showUserDetail(userResponse: GitHubResponse)
}