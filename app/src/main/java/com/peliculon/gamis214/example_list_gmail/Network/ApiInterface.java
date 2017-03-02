package com.peliculon.gamis214.example_list_gmail.Network;

import com.peliculon.gamis214.example_list_gmail.Model.FeedResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JAAH on 02/03/17.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<FeedResponse>> getInbox();

}
