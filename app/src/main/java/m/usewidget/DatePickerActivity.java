package m.usewidget;


import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.Toast;

public class DatePickerActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("DatePickerActivity");
		setContentView(R.layout.date_picker);
		
		//找到日期选择控件date_picker
		DatePicker date_picker =  (DatePicker)findViewById(R.id.date_picker);
		//
		OnDateChangedListener date_change_listener = new OnDateChangedListener() {
			public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"您设置的日期为："+year+"年"+(monthOfYear+1)+"月"+dayOfMonth+"日", Toast.LENGTH_SHORT).show();
			}
		};
		//为它初始化一个日期
		date_picker.init(2016,3,22, date_change_listener);
		
		//为它设置另外一个日期
		date_picker.updateDate(1988, 9, 07);
	}

 

 
}