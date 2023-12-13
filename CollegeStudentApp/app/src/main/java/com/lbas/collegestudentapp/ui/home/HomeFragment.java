package com.lbas.collegestudentapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.lbas.collegestudentapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(2);

        setSliderViews();

        map=view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0,0?q=No.63, Near BEL Layout, Off Magadi Road, Vishwaneedham Post, Anjananagar, Bengaluru-560091.");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {

        for(int i=0;i<5;i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch(i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeadmin-7e4d2.appspot.com/o/clg_img%2Fmainbuilding.jpg?alt=media&token=a9353418-7f8f-4b85-9d9c-c0a28f5895e9");
                    break;

                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeadmin-7e4d2.appspot.com/o/clg_img%2Fclassroom.jpg?alt=media&token=748782f8-20ea-4f1a-8992-bd43378441cd");
                    break;

                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeadmin-7e4d2.appspot.com/o/clg_img%2Fsmartclassroom.jpg?alt=media&token=5fb8da07-af59-4940-a6b2-46e4cd3fff5c");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/collegeadmin-7e4d2.appspot.com/o/clg_img%2Fseminar_hall2.jpg?alt=media&token=646a78db-01cf-4771-a7cb-3b1dc57fa0d9");
                    break;

                case 4:
                    sliderView.setImageUrl("");
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}