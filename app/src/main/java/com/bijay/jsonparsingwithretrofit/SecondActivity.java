package com.bijay.jsonparsingwithretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String itemname = getIntent().getExtras().getString("itemName");
        String item_price = getIntent().getExtras().getString("itemPrice");

        Toast.makeText(this, "Price of "+itemname+" is "+item_price, Toast.LENGTH_SHORT).show();
    }
}
