package com.bijay.jsonparsingwithretrofit;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //// progress dialog

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading ....");
        progressDialog.setCancelable(false);
        progressDialog.show();

        getMenuJson();
    }

    public void getMenuJson(){

        RetrofitApiInterface retrofitApiInterface = RetrofitClient.getRetrofit().create(RetrofitApiInterface.class);

        Call<List<MenuModalClass>> modalClassCall = retrofitApiInterface.getMenu();

        modalClassCall.enqueue(new Callback<List<MenuModalClass>>() {
            @Override
            public void onResponse(Call<List<MenuModalClass>> call, Response<List<MenuModalClass>> response) {

                ///// first way
               // List<MenuModalClass> modalClasses = response.body();
               // RecyclerviewAdapter recyclerviewAdapter1 = new RecyclerviewAdapter(MainActivity.this,modalClasses);

                //// second way
                RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(MainActivity.this,response.body());
              //  RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
                recyclerView.setLayoutManager(horizontalLayoutManager);
                recyclerView.setHasFixedSize(true);

                //recyclerView.setLayoutManager(layoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(recyclerviewAdapter);
                recyclerviewAdapter.notifyDataSetChanged();

                if (progressDialog.isShowing()){
                    progressDialog.dismiss();
                }

            }

            @Override
            public void onFailure(Call<List<MenuModalClass>> call, Throwable t) {

            }
        });

    }
}
