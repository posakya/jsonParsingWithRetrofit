package com.bijay.jsonparsingwithretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Bijay on 6/2/2018.
 */

public interface RetrofitApiInterface {

    @GET("api.php")
    Call<List<MenuModalClass>> getMenu();

}
