package com.example.kimys1324.kopet_admin.Fragments.FingerPrintIdentification;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kimys1324.kopet_admin.R;

/**
 * Created by kimys1324 on 7/14/16.
 */
public class FingerPrintFragment extends Fragment {

    ImageButton fingerBtn;
    ImageView fakeFail;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_fingerprint, container, false);

        fingerBtn = (ImageButton)rootView.findViewById(R.id.fake_next_btn);

        fingerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //next

                afterFingerprintIdFound();
            }
        });

        fakeFail = (ImageView)rootView.findViewById(R.id.fake_fail_btn);
        fakeFail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //fail

                afterFingerprintIdUnfound();
            }
        });

        return rootView;
    }

    public void afterFingerprintIdFound()
    {
        Fragment fragment = new FoundFragment();


        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content, fragment)
                .addToBackStack(null)
                .commit();
    }

    public void afterFingerprintIdUnfound()
    {
        Fragment fragment = new UnfoundFragment();


        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_content, fragment)
                .addToBackStack(null)
                .commit();
    }


}
