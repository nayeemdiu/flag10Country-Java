package com.flags10country.Flags10country;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    //int[] pic;
    String[] allBoardNames;
    String[] boardBangla;
    Context context;
    private LayoutInflater inflater;
    CustomAdapter(Context context, String[] allBoardNames, String[] boardBangla){

        this.context = context;
        this.allBoardNames= allBoardNames;
        this.boardBangla= boardBangla;
        //  this.pic = pic;
    }

    @Override
    public int getCount() {
        return allBoardNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){

            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  inflater.inflate(R.layout.activity_design,parent,false);
        }

        //  ImageView  imageView = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.allBoadNameId);
        TextView textView1 = convertView.findViewById(R.id.allBoadNamedecriptinId);

        //imageView.setImageResource(pic[position]);
        textView.setText(allBoardNames[position]);
        textView1.setText(boardBangla[position]);

        return convertView;
    }
}
