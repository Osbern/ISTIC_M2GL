package fr.istic.m2.fragment;

import fr.istic.m2.sit.ihm.MainActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
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
            	Log.w("FRAGMENT", "desize");
            	getActivity().findViewById(42).getLayoutParams().width = 2;
            	getActivity().findViewById(42).invalidate();
            	getActivity().findViewById(13).invalidate();
            	getActivity().findViewById(1).invalidate();
            	((MainActivity) getActivity()).map.mapView.invalidate();
            }
        });
        
        layout.addView(btn);

        return layout;
    }
}