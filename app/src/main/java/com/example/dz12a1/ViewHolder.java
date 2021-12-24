package com.example.dz12a1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView  name;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.item_name);
        image = itemView.findViewById(R.id.item_image);
    }
    public void onBind(Person person){
        image.setImageResource(person.getImage());
        name.setText(person.getName());
    }
}
