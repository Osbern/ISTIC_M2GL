package fr.istic.m2.fragment;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ItemsFragment extends ListFragment {
	
	private Activity act;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        act = getActivity();
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
    	super.onActivityCreated(savedInstanceState);
    	
    	String[] list = {"toto", "tat"};
        setListAdapter(new ArrayAdapter<String>(act, android.R.layout.simple_list_item_1, list));
        
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }    
    
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    	//super.onViewCreated(view, savedInstanceState);
    }
    
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    	super.onListItemClick(l, v, position, id);
    	Toast.makeText(act, l.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
    }

    
    
}