package com.example.androidintermedio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidintermedio.model.Product;

public class ProductsAdapter extends RecyclerView.Adapter{

    Product[] products;

    ProductsAdapter(Product[] products){
        this.products = products;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.mio_layout_item, parent, false);

        return new ProductsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Product product = products[position];
        ((ProductsViewHolder) holder).bind(product);
    }

    @Override
    public int getItemCount() {
        return products.length;
    }
    public static class ProductsViewHolder extends RecyclerView.ViewHolder  {
        TextView title;
        TextView description;
        ImageView image;

        public void bind(Product prodotto){
            title.setText(prodotto.getProduct_title());
            description.setText(prodotto.getTitle_description());
        }
        ProductsViewHolder(@NonNull View viewItem){
            super(viewItem);
            this.title = viewItem.findViewById(R.id.product_title);
            this.description = viewItem.findViewById(R.id.product_description);
            this.image = viewItem.findViewById(R.id.immagine);
        }
    }
}
