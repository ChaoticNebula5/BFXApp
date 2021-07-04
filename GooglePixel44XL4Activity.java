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


public class GooglePixel44XL4Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, GooglePixel44XL4Activity.class);
	}
	
	private TextView nationalRuralHealtTextView;
	private TextView inGovernmentHtextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.google_pixel44_xl4_activity);
		this.init();
	}
	
	private void init() {
	
		
		nationalRuralHealtTextView = this.findViewById(R.id.national_rural_healt_text_view);
		
		
		inGovernmentHtextView = this.findViewById(R.id.in_government_htext_view);
	}
}
