package fr.istic.m2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ItemsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout layout = new RelativeLayout(getActivity());

        // Watch for button clicks.
        Button btn = new Button(getActivity());
        btn.setText("FRAGMENT");
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            }
        });
        
        layout.addView(btn);

        return layout;
    }
}