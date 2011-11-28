package br.com.gonow.project;

import roboguice.activity.RoboFragmentActivity;
import roboguice.inject.ContentView;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.inject.Inject;

@ContentView(R.layout.fragment)
public class MainActivity extends RoboFragmentActivity implements OnClickListener {
	private @Inject FragmentManager fragmentManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		fragmentManager.beginTransaction().add(R.id.fragment, new TitlesFragment()).commit();
	}

	@Override
	public void onClick(View view) {
		fragmentManager.beginTransaction().replace(R.id.fragment, new OtherFragment()).addToBackStack(null).commit();
	}

}