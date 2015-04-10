package com.example.exam;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HeadimgAdapter extends ArrayAdapter<Headimg>{
	private int resourceId;
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Headimg head=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		ImageView headImage=(ImageView) view.findViewById(R.id.head_img);
		TextView headName=(TextView) view.findViewById(R.id.head_name);
		headImage.setImageResource(head.getImageId());
		headName.setText(head.getName());
		return view;
	}


	public HeadimgAdapter(Context context,
			int textViewResourceId, List<Headimg> headList) {
		super(context, textViewResourceId, headList);
		resourceId=textViewResourceId;
		// TODO Auto-generated constructor stub
	}

}
