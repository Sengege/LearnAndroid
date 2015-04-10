package com.example.exam;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.exam.R;

@SuppressLint("NewApi")
public class MainTab02 extends ListFragment
{
private List<Headimg> headList=new ArrayList<Headimg>();   //∑≈÷√List ˝æ›
private HeadimgAdapter adapter;

private FragmentManager manager;
private FragmentTransaction transaction;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.main_tab_02,null);


		setListAdapter(adapter);
		adapter.notifyDataSetChanged();	
	
		return view;

	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		initFruits();
		adapter=new HeadimgAdapter(getActivity(), R.layout.headimg, headList);
		manager = getFragmentManager();
	}
	private void initFruits() {
		Headimg yy=new Headimg("YY",R.drawable.h101);
		headList.add(yy);
		Headimg tt=new Headimg("TT",R.drawable.h102);
		headList.add(tt);
		
	}

}
