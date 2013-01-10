package com.athena.asm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

public class SubjectListActivity extends BaseFragmentActivity
								 implements ProgressDialogProvider, OnOpenActivityFragmentListener {
	
	private ProgressDialog m_pdialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(aSMApplication.ORIENTATION);
		setContentView(R.layout.subject_list_activity);	
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	public void showProgressDialog() {
		if (m_pdialog == null) {
			m_pdialog = new ProgressDialog(this);
			m_pdialog.setMessage("加载版面列表中...");
			m_pdialog.show();
		}
	}
	
	public void dismissProgressDialog() {
		if (m_pdialog != null) {
			m_pdialog.cancel();
			m_pdialog = null;
		}
	}
	
	@Override
	public void onOpenActivityOrFragment(String target, Bundle bundle) {
		if (target.equals(ActivityFragmentTargets.POST_LIST)) {
			Intent intent = new Intent();
			intent.putExtras(bundle);
			intent.setClassName("com.athena.asm", PostListActivity.class.getName());
			startActivityForResult(intent, 0);
		}
	}
}
