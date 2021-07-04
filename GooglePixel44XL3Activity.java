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


public class GooglePixel44XL3Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		return new Intent(context, GooglePixel44XL3Activity.class);
	}
	
	private TextView mgnregaFacesTheChTextView;
	private TextView theGovernmTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.google_pixel44_xl3_activity);
		this.init();
	}
	
	private void init() {
	
		
		mgnregaFacesTheChTextView = this.findViewById(R.id.mgnrega_faces_the_ch_text_view);
		
		
		theGovernmTextView = this.findViewById(R.id.the_governm_text_view);
	}
}
