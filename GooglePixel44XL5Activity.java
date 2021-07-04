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


public class GooglePixel44XL5Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		return new Intent(context, GooglePixel44XL5Activity.class);
	}
	
	private TextView aStudyConductedBeTextView;
	private TextView theAverageLicenseeTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.google_pixel44_xl5_activity);
		this.init();
	}
	
	private void init() {
	
		
		aStudyConductedBeTextView = this.findViewById(R.id.a_study_conducted_be_text_view);
		
		
		theAverageLicenseeTextView = this.findViewById(R.id.the_average_licensee_text_view);
	}
}
