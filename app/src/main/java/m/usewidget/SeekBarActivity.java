package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class SeekBarActivity extends Activity {
	CheckBox plain_cb;
	CheckBox serif_cb;
	CheckBox italic_cb;
	CheckBox bold_cb;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("SeekBarActivity");
		setContentView(R.layout.seek_bar);
//		find_and_modify_text_view();
		
		SeekBar myseekBar = (SeekBar)findViewById(R.id.seek);
		final TextView textview = (TextView)findViewById(R.id.text_seek);
		final EditText editText = (EditText)findViewById(R.id.edit_text);
		
		myseekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "停止滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "开始滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				textview.setText("当前的滑动值为："+progress+"  最大值为1000");
				editText.setText("当前的滑动值为："+progress+"  最大值为1000");
			}
		});
	}

}