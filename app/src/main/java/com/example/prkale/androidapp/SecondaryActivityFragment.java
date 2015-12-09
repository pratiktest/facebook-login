package com.example.prkale.androidapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;


import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class SecondaryActivityFragment extends ListFragment {

    public SecondaryActivityFragment() {
    }

  /*  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_secondary, container, false);
    }*/
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //you will need a list view here to get the view and set the adaptor. MAke sure you have a list view
        Tweet tweet = new Tweet();
        tweet.author = "dbradby";
        tweet.content = "Android in space";
        ArrayList<Tweet> items = new ArrayList<Tweet>();
        items.add(tweet);
        getListView().setAdapter(new SampleAdaptor(getActivity(), R.layout.list_item, items));
        setListShown(true);
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
