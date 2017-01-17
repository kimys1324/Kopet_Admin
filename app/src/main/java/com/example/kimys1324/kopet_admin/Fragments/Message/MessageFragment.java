package com.example.kimys1324.kopet_admin.Fragments.Message;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kimys1324.kopet_admin.R;

/**
 * Created by kimys1324 on 7/14/16.
 */
public class MessageFragment extends Fragment{


    ImageView fakeBtn;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_message, container, false);

        fakeBtn = (ImageView)rootView.findViewById(R.id.chat_fake_btn);
        fakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new CreateFakeChatting1();

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
