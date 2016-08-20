package com.example.batcomputer.locatr;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Bat Computer on 20-08-2016.
 */
public class LocatrFragment extends Fragment {
    private ImageView mImageView;
    public static LocatrFragment newInstance() {
        return new LocatrFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_locatr, container, false);
        mImageView = (ImageView) v.findViewById(R.id.image);
        return v;
        
    }
}
