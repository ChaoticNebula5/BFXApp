package com.company_name.bfx_corruption_project.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.company_name.bfx_corruption_project.R;


public class OpeningPageActivity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		// Fill the created intent with the data you want to be passed to this Activity when it's opened.
		return new Intent(context, OpeningPageActivity.class);
	}
	
	private Button viewButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.opening_page_activity);
		this.init();
	}
	
	private void init() {
	
		// Configure View component
		viewButton = this.findViewById(R.id.view_button);
		viewButton.setOnClickListener((view) -> {
	this.onViewPressed();
});
	}
	
	public void onViewPressed() {
	
		this.startMapActivity();
	}
	
	private void startMapActivity() {
	
		this.startActivity(MapActivity.newIntent(this));
	}
}
