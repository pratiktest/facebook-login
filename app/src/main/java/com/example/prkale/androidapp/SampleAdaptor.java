package com.example.prkale.androidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by prkale on 11/28/15.
 */
public class SampleAdaptor extends ArrayAdapter<Tweet> {


    private static final String[] SAMPLE_DATA = {
            "A for Android",
            "B for Bacon"
    };

    private final ArrayList<Tweet> tweets;

    private final LayoutInflater m_layoutInflater;

/*    public SampleAdaptor(Context context) {
        super(context, android.R.layout.simple_list_item_1, SAMPLE_DATA);
    }*/

    public SampleAdaptor(Context context, int resource, ArrayList<Tweet> items) {
        super(context, resource, items);
        m_layoutInflater = LayoutInflater.from(context);
        tweets = items;
    }

    //once a view is created render the view at the position
    //view is the tweet
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get a view
        View v =  convertView;
        //this is the first time you are rendering a view so inflate it
        if(v==null){
            v = m_layoutInflater.inflate(R.layout.list_item, parent, false);
        }

        //if this is not the first time
        Tweet o = tweets.get(position);
        TextView tt = (TextView) v.findViewById(R.id.topText);
        TextView bt = (TextView) v.findViewById(R.id.bottomText);
        tt.setText(o.content);
        bt.setText(o.author);

        return v;
    }
}
