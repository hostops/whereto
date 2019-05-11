package com.etilk.travel.whereto.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.etilk.travel.whereto.KiwiActivity;
import com.etilk.travel.whereto.R;

import java.util.List;

import io.swagger.client.model.LocationDTO;

public abstract class RecommendationsSlideAdapter extends ArrayAdapter<LocationDTO> {



    public RecommendationsSlideAdapter(Context context, List<LocationDTO> locationDTOS) {
        super(context,0,locationDTOS);
    }


    public abstract void checked(LocationDTO locationDTO) ;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        final LocationDTO locationDTO = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_location, parent, false);
        }

        ImageView destinationImageView = convertView.findViewById(R.id.destinationImageView);
        Button btnNext = convertView.findViewById(R.id.btnNext);
        TextView imageDescriptionView = convertView.findViewById(R.id.imageDescriptionView);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checked(locationDTO);
            }
        });

        byte[] decodedString = Base64.decode(locationDTO.getImage(), Base64.DEFAULT);
        Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);

        imageDescriptionView.setText(locationDTO.getName());
        destinationImageView.setImageBitmap(decodedByte);;
        // Return the completed view to render on screen
        return convertView;
    }

}
