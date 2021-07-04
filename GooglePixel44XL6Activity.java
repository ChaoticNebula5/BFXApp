package com.company_name.bfx_corruption_project.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.company_name.bfx_corruption_project.R;


public class GooglePixel44XL6Activity extends AppCompatActivity {
	
	public static Intent newIntent(Context context) {
	
		return new Intent(context, GooglePixel44XL6Activity.class);
	}
	
	private TextView aNovember2010RepoTextView;
	private TextView blackMoneyRefersTtextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.google_pixel44_xl6_activity);
		this.init();
	}
	
	private void init() {
	
		
		aNovember2010RepoTextView = this.findViewById(R.id.a_november2010_repo_text_view);
		
		
		blackMoneyRefersTtextView = this.findViewById(R.id.black_money_refers_ttext_view);
		SpannableString blackMoneyRefersTtextViewText = new SpannableString("Corrupt practices such as taking or giving bribes, transactions in black money done by bureaucrats, politicians, civil servants and high profile businessman leads to the creation of black money. The transactions in black money are rarely caught because of the high profile back-ups because of which the culprits are never caught by the government. Every person from every class such as from a B grade employee to a high ranking officer of the government is involved in the creation of black money. Hundreds of cases were registered\n\n\n\n\n\n\n\n");
		blackMoneyRefersTtextViewText.setSpan(new ForegroundColorSpan(Color.parseColor("#DCDDDE")), 538, 539, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		blackMoneyRefersTtextView.setText(blackMoneyRefersTtextViewText);
	}
}
