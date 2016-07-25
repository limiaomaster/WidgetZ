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

public class EditTextActivity extends Activity {
	/** Called when the activity is first created. */
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("EditTextActivity");        
		setContentView(R.layout.editview);
		find_and_modify_text_view();
	}

 
	private void find_and_modify_text_view() {
		Button get_edit_view_button = (Button) findViewById(R.id.get_edit_view_button);
		get_edit_view_button.setOnClickListener(get_edit_view_button_listener);
	}

	private Button.OnClickListener get_edit_view_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			EditText edit_text = (EditText) findViewById(R.id.edit_text);
			CharSequence edit_text_value = edit_text.getText();
			//1.把标题设置为。。。
			setTitle("EditText的值:"+edit_text_value);
			//2.把布局中的display文本框设置为。。。
			TextView mytext = (TextView) findViewById(R.id.display);
			mytext.setText(edit_text_value);
			//3.浮动消息显示。。。
			Toast.makeText(getApplicationContext(),"编辑框的内容为："+mytext.getText(), Toast.LENGTH_LONG).show();
		}
	};

}