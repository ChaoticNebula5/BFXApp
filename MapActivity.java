package com.company_name.bfx_corruption_project.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.company_name.bfx_corruption_project.R;


public class MapActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, MapActivity.class);
	}
	
	private TextView corruptionActivitieTextView;
	private Button viewButton;
	private LinearLayout rectangle4Button;
	private Button viewTwoButton;
	private Button viewThreeButton;
	private Button viewFourButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.map_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure CORRUPTION ACTIVITIE component
		corruptionActivitieTextView = this.findViewById(R.id.corruption_activitie_text_view);
		
		// Configure View component
		viewButton = this.findViewById(R.id.view_button);
		viewButton.setOnClickListener((view) -> {
	this.onViewTwoPressed();
});
		
		// Configure Rectangle 4 component
		rectangle4Button = this.findViewById(R.id.rectangle4_button);
		rectangle4Button.setOnClickListener((view) -> {
	this.onRectangle4Pressed();
});
		
		// Configure View component
		viewTwoButton = this.findViewById(R.id.view_two_button);
		viewTwoButton.setOnClickListener((view) -> {
	this.onViewPressed();
});
		
		// Configure View component
		viewThreeButton = this.findViewById(R.id.view_three_button);
		viewThreeButton.setOnClickListener((view) -> {
	this.onViewFourPressed();
});
		
		// Configure View component
		viewFourButton = this.findViewById(R.id.view_four_button);
		viewFourButton.setOnClickListener((view) -> {
	this.onViewThreePressed();
});
	}
	
	public void onViewTwoPressed() {
	
		this.startGooglePixel44XL5Activity();
	}
	
	public void onRectangle4Pressed() {
	
		this.startGooglePixel44XL3Activity();
	}
	
	public void onViewPressed() {
	
		this.startGooglePixel44XL4Activity();
	}
	
	public void onViewFourPressed() {
	
		this.startGooglePixel44XL7Activity();
	}
	
	public void onViewThreePressed() {
	
		this.startGooglePixel44XL6Activity();
	}
	
	private void startGooglePixel44XL7Activity() {
	
		this.startActivity(GooglePixel44XL7Activity.newIntent(this));
	}
	
	private void startGooglePixel44XL5Activity() {
	
		this.startActivity(GooglePixel44XL5Activity.newIntent(this));
	}
	
	private void startGooglePixel44XL3Activity() {
	
		this.startActivity(GooglePixel44XL3Activity.newIntent(this));
	}
	
	private void startGooglePixel44XL6Activity() {
	
		this.startActivity(GooglePixel44XL6Activity.newIntent(this));
	}
	
	private void startGooglePixel44XL4Activity() {
	
		this.startActivity(GooglePixel44XL4Activity.newIntent(this));
	}
}
