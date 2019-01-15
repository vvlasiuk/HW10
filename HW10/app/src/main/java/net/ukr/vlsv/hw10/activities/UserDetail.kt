package net.ukr.vlsv.hw10.activities

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_user_detail.*
import net.ukr.vlsv.hw10.R
import net.ukr.vlsv.hw10.data.Users
import net.ukr.vlsv.hw10.model.GitHubResponse
import net.ukr.vlsv.hw10.network.GitHubService
import net.ukr.vlsv.hw10.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI

class UserDetail : AppCompatActivity(), MainView {
    private val presenter by lazy {
        MainPresenter(Repository(), this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        val user = intent.getSerializableExtra("User") as Users

        presenter.fetchUserDetail(user.Name)
    }

    override fun showUserDetail(userResponse: GitHubResponse) {
        user_name.text                = "name: " + userResponse.name
        user_id.text                  = "id: " + userResponse.id.toString()
        user_nickname.text            = "nickname: " + userResponse.nickname
        user_page_url.text            = "URL: " + userResponse.pageUrl
        user_followers_count.text     = "followers count: " + userResponse.followersCount.toString()
        user_following_count.text     = "following count: " + userResponse.followingCount.toString()
        user_number_gists.text        = "number of gists: " + userResponse.numberGists.toString()
        user_number_repositories.text = "number of repositories: " + userResponse.numberRepositories.toString()
        Picasso.get().load(userResponse.photoUrl).into(user_photo_url)
    }
}
