package com.example.kimys1324.kopet_admin.Fragments.FingerPrintIdentification;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kimys1324.kopet_admin.R;

/**
 * Created by kimys1324 on 7/16/16.
 */
public class UnfoundFragment  extends Fragment {

    Button nxtBtn;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_unfound, container, false);

        nxtBtn = (Button)rootView.findViewById(R.id.unfound_nxt_btn);

        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FRFragment();

                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_content, fragment)
                        .addToBackStack(null)
                        .commit();

            }
        });


        return rootView;
    }
}
