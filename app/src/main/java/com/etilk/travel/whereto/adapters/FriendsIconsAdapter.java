package com.etilk.travel.whereto.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.etilk.travel.whereto.R;

import java.util.List;

import io.swagger.client.model.UserDTO;

public class FriendsIconsAdapter extends PagerAdapter {

    List<UserDTO> userDTOS;

    Context context;
    LayoutInflater layoutInflater;

    public FriendsIconsAdapter(Context context, List<UserDTO> userDTOS) {
        this.context = context;
        this.userDTOS = userDTOS;
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

        UserDTO UserDTO = userDTOS.get(position);

        ImageView destinationImageView = view.findViewById(R.id.destinationImageView);

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
