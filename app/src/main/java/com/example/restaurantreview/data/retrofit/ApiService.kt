package com.example.restaurantreview.data.retrofit

import com.example.restaurantreview.data.response.GithubResponse
import com.example.restaurantreview.data.response.PostReviewResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getListUsers(@Query("q") q : String) : Call<GithubResponse>
}