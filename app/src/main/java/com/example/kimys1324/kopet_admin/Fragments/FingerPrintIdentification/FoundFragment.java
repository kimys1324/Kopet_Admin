package com.example.kimys1324.kopet_admin.Fragments.FingerPrintIdentification;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kimys1324.kopet_admin.R;

/**
 * Created by kimys1324 on 7/16/16.
 */
public class FoundFragment extends Fragment {

    ImageButton found;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_found, container, false);

        found = (ImageButton)rootView.findViewById(R.id.pet1_card_report_missing_btn);

        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                found.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }

    private void reportMissing()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());

        builder.setMessage("실종상태가 해제되었습니다.")
                .setPositiveButton("확인", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Fragment fragment = new FingerPrintFragment();

                        getActivity().getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.main_content, fragment)
                                .addToBackStack(null)
                                .commit();

                        //확인 눌렀을 때 Action
                    }
                } );
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
