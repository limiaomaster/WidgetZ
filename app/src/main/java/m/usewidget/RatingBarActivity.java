package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RatingBarActivity extends Activity {
	CheckBox plain_cb;
	CheckBox serif_cb;
	CheckBox italic_cb;
	CheckBox bold_cb;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("RatingBarActivity");
		setContentView(R.layout.rating_bar);

		RatingBar mRatingBar = (RatingBar)findViewById(R.id.ratingbar_movie);
		mRatingBar.setNumStars(5);
		mRatingBar.setStepSize((float)0.5);
		mRatingBar.setRating((float)4.5);
		
		mRatingBar.setOnRatingBarChangeListener (new RatingBar.OnRatingBarChangeListener() {
			
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "分数等级为："+rating, Toast.LENGTH_SHORT).show();
			}
		});
		
	}
}