package com.company_name.bfx_corruption_project.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.company_name.bfx_corruption_project.R;


public class GooglePixel44XL7Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, GooglePixel44XL7Activity.class);
	}
	
	private TextView niravModiCasePnbTextView;
	private TextView moneyLaunderingTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.google_pixel44_xl7_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure Nirav Modi Case. PNB component
		niravModiCasePnbTextView = this.findViewById(R.id.nirav_modi_case_pnb_text_view);
		
		// Configure Money laundering: component
		moneyLaunderingTextView = this.findViewById(R.id.money_laundering_text_view);
	}
}
