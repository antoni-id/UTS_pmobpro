package com.example.antoni.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.aden.uts.adapter.Product;
import com.example.aden.uts.adapter.ProductListAdapter;
import com.example.aden.uts.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "nasi goreng", "Makanan khas indonesia", 10000);
        Product product2 = new Product(2, "Ranginang",
                "Makanan khas buat cemilan", 5000);
        Product product3 = new Product(3, "Tahu Gejrot",
                "Makanan khas yang terbuat dari tahu", 5000);
        Product product4 = new Product(4, "Tumpeng",
                "Nasi kuning khas sunda", 50000);
        Product product5 = new Product(5, "Ulukuteuk",
                "Makanan khas sunda enak", 10000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
    }
}
