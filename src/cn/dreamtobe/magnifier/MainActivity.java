package cn.dreamtobe.magnifier;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import cn.dreamtobe.magnifier.widget.WordView;

/**
 * @author jacksgong
 */
public class MainActivity extends Activity {

	private final String DEMO_WORDS = "From tomorrow on, I will be a happy man;\n\nGrooming, chopping, and traveling all over the world.\n\nFrom tomorrow on, I will care foodstuff and vegetable.\n\nLiving in a house towards the sea, with spring blossoms.\n\nFrom tomorrow on, write to each of my dear ones,\n\nTelling them of my happiness.";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		setContentView(wordViewTest());
	}

	private WordView wordViewTest() {
		WordView wordView = new WordView(this);
		wordView.setText(DEMO_WORDS);
		wordView.setBackgroundColor(Color.WHITE);
		wordView.setTextColor(Color.BLACK);
		return wordView;
	}
}
