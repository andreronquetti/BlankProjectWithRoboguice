package br.com.gonow.project;

import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class TitlesFragment extends RoboFragment {
	private @InjectView(android.R.id.text1) TextView textView;
	private @InjectView(android.R.id.button1) Button button;
	private @InjectResource(R.string.hello) String text;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.main, container, false);
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		textView.setText(text);
		
		button.setOnClickListener((MainActivity) getActivity());
	}
}
