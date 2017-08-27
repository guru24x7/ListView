package com.example.saqib.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class SingleListItem extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
        TextView txtProduct = findViewById(R.id.product_label);

        Intent i = getIntent();
        String product = i.getStringExtra("Product");
        txtProduct.setText(product);
    }
}
