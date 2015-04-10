package com.example.exam;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

@SuppressLint("NewApi")
public class MainTab01 extends Fragment implements OnClickListener {
	private Button one;
	private Button two;
	private Button three;
	private Button four;
	private Button five;
	private Button six;
	private Button seven;
	private Button eight;
	private Button nine;
	private Button zero;
	private Button dot;
	private Button add;
	private Button sub;
	private Button mult;
	private Button division;
	private Button result;
	private View rootView;
	
	private EditText led;
	
	private String str="";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		
		rootView=inflater.inflate(com.example.exam.R.layout.main_tab_01,
				null);
		led=(EditText) rootView.findViewById(R.id.led);
		
		zero = (Button) rootView.findViewById(R.id.zero);
		one = (Button) rootView.findViewById(R.id.one);
		two = (Button) rootView.findViewById(R.id.two);
		three = (Button) rootView.findViewById(R.id.three);
		four = (Button) rootView.findViewById(R.id.four);
		five = (Button) rootView.findViewById(R.id.five);
		six = (Button) rootView.findViewById(R.id.six);
		seven = (Button) rootView.findViewById(R.id.seven);
		eight = (Button) rootView.findViewById(R.id.eight);
		nine = (Button) rootView.findViewById(R.id.nine);
		dot = (Button) rootView.findViewById(R.id.dot);
		add=(Button) rootView.findViewById(R.id.add);
		result=(Button) rootView.findViewById(R.id.result);
		sub=(Button) rootView.findViewById(R.id.sub);
		mult=(Button) rootView.findViewById(R.id.mult);
		division=(Button) rootView.findViewById(R.id.division);
		division.setOnClickListener(this);
		mult.setOnClickListener(this);
		sub.setOnClickListener(this);
		result.setOnClickListener(this);
		add.setOnClickListener(this);
		zero.setOnClickListener(this);
		one.setOnClickListener(this);
		two.setOnClickListener(this);
		three.setOnClickListener(this);
		four.setOnClickListener(this);
		five.setOnClickListener(this);
		six.setOnClickListener(this);
		seven.setOnClickListener(this);
		eight.setOnClickListener(this);
		nine.setOnClickListener(this);
		dot.setOnClickListener(this);
		
		
		
		
		return rootView;
		
	

	}




	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.zero:
			str=str+"0";
			led.setText(str);
			
			break;
		case R.id.one:
			str=str+"1";
			led.setText(str);
			
			break;
		case R.id.two:
			str=str+"2";
			led.setText(str);
			
			break;
		case R.id.three:
			str=str+"3";
			led.setText(str);
			
			break;
		case R.id.four:
			str=str+"4";
			led.setText(str);
			
			break;
		case R.id.five:
			str=str+"5";
			led.setText(str);
			
			break;
		case R.id.six:
			str=str+"6";
			led.setText(str);
			
			break;
		case R.id.seven:
			str=str+"7";
			led.setText(str);
			
			break;
		case R.id.eight:
			str=str+"8";
			led.setText(str);
			
			break;
		case R.id.nine:
			str=str+"9";
			led.setText(str);
			
			break;
		case R.id.dot:
			str=str+".";
			led.setText(str);
			
			break;
		case R.id.add:
			str=str+"+";
			led.setText(str);
			
			break;
		case R.id.result:
			String res=new Bean.calc().execute(str);
			led.setText(res);
			str="";
			
			break;
		case R.id.sub:
			str=str+"-";
			led.setText(str);
			
			break;
			
		case R.id.mult:
			str=str+"*";
			led.setText(str);
			
			break;
		case R.id.division:
			str=str+"/";
			led.setText(str);
			
			break;
		default:
			break;
		}
		
	}

}
