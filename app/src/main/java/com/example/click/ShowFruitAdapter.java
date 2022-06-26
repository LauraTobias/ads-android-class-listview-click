package com.example.click;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.click.model.Fruit;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class ShowFruitAdapter extends ArrayAdapter
{
    Context mContext;
    int mResource;

    public ShowFruitAdapter( Context context, int resource, List objects) {
        super(context, resource,  objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);

        TextView tvCode = (TextView) convertView.findViewById(R.id.tvCode);
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvPrice =  (TextView) convertView.findViewById(R.id.tvPrice);
        TextView tvSalePrice =(TextView) convertView.findViewById(R.id.tvSalePrice);
        ImageView imgView = (ImageView) convertView.findViewById(R.id.imageView);

        Fruit fruit = (Fruit) getItem(position);

        NumberFormat nf = new DecimalFormat("#,###.00");

        tvCode.setText(Integer.toString(fruit.getCode()));
        tvName.setText(fruit.getName());
        tvPrice.setText(nf.format (fruit.getPrice()));
        tvSalePrice.setText(nf.format (fruit.getSalePrice()));
        imgView.setImageResource(fruit.getImage());

        return convertView;
    }
}
