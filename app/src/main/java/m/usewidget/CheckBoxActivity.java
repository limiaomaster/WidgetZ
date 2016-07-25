package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxActivity extends Activity {
	CheckBox checkBox1;
	CheckBox checkBox2;
	CheckBox checkBox3;
	CheckBox checkBox4 ;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("CheckBoxActivity");
		setContentView(R.layout.check_box);
		find_and_modify_text_view();
	}

	private void find_and_modify_text_view() {
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
		checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
		Button get_view_button = (Button) findViewById(R.id.get_view_button);
		get_view_button.setOnClickListener(get_view_button_listener);
		checkBox2.setChecked(true);
		checkBox3.setChecked(true);
	}

	private Button.OnClickListener get_view_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			String show = "您刚选择了：";
			if (checkBox1.isChecked()) {
				 show = show + " " + checkBox1.getText();
			}
			if (checkBox2.isChecked()) {
				show = show + " " + checkBox2.getText();
			}
			if (checkBox3.isChecked()) {
				show = show + " " + checkBox3.getText();
			}
			if (checkBox4.isChecked()) {
				show = show + " " + checkBox4.getText();
			}
			setTitle("CheckBoxActivity:" + show);
			Toast.makeText(getApplicationContext(), show, Toast.LENGTH_SHORT).show();
		}
	};
}