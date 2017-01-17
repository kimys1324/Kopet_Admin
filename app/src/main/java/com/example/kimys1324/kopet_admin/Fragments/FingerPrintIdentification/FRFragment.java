package com.example.kimys1324.kopet_admin.Fragments.FingerPrintIdentification;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
public class FRFragment extends Fragment {


    Button btn;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_fr, container, false);


        btn = (Button)rootView.findViewById(R.id.finish_unfound);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reportMissing();
            }
        });
        return rootView;
    }


    private void reportMissing()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());

        builder.setMessage("비문등록이 완료되었습니다")
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
