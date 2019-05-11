package com.etilk.travel.whereto.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.etilk.travel.whereto.R;

import java.util.List;

import io.swagger.client.model.LocationDTO;

public class RecommendationsSlideAdapter extends PagerAdapter {

    List<LocationDTO> locationDTOS;

    Context context;
    LayoutInflater layoutInflater;

    public RecommendationsSlideAdapter(Context context, List<LocationDTO> locationDTOS) {
        this.context = context;
        this.locationDTOS = locationDTOS;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.layout_location, container, false);

        LocationDTO locationDTO = locationDTOS.get(position);

        ImageView destinationImageView = view.findViewById(R.id.destinationImageView);
        Button btnNext = view.findViewById(R.id.btnNext);
        TextView imageDescriptionView = view.findViewById(R.id.imageDescriptionView);

        imageDescriptionView.setText(locationDTO.getName());

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }


}
