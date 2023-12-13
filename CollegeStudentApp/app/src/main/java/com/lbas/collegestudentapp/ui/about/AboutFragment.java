package com.lbas.collegestudentapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lbas.collegestudentapp.R;


public class AboutFragment extends Fragment {

    private ImageView image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_about, container, false);
        image = view.findViewById(R.id.collegeImg);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/collegeadmin-7e4d2.appspot.com/o/clg_img%2Fmainbuilding.jpg?alt=media&token=a9353418-7f8f-4b85-9d9c-c0a28f5895e9")
                .into(image);
        return view;
    }
}