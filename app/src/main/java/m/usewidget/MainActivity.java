package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		find_and_modify_button();
	}

	private void find_and_modify_button() {
		
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(button_listener);
		
		Button Button_toggle = (Button) findViewById(R.id.Button_toggle);
		Button_toggle.setOnClickListener(button_toggle_listener);
		
		Button text_view_button = (Button) findViewById(R.id.text_view_button);
		text_view_button.setOnClickListener(text_view_button_listener);
		
		Button edit_view_button = (Button) findViewById(R.id.edit_view_button);
		edit_view_button.setOnClickListener(edit_view_button_listener);
		
		Button check_box_button = (Button) findViewById(R.id.check_box_button);
		check_box_button.setOnClickListener(check_box_button_listener);
		
		Button radio_group_button = (Button) findViewById(R.id.radio_group_button);
		radio_group_button.setOnClickListener(radio_group_button_listener);
		
		Button spinner_button = (Button) findViewById(R.id.spinner_button);
		spinner_button.setOnClickListener(spinner_button_listener);

		Button auto_complete_button = (Button) findViewById(R.id.auto_complete_button);
		auto_complete_button.setOnClickListener(auto_complete_button_listener);
		
		Button date_picker_button = (Button) findViewById(R.id.date_picker_button);
		date_picker_button.setOnClickListener(date_picker_button_listener);
		
		Button time_picker_button = (Button) findViewById(R.id.time_picker_button);
		time_picker_button.setOnClickListener(time_picker_button_listener);

		Button progress_bar_button = (Button) findViewById(R.id.progress_bar_button);
		progress_bar_button.setOnClickListener(progress_bar_button_listener);

		Button seek_bar_button = (Button) findViewById(R.id.seek_bar_button);
		seek_bar_button.setOnClickListener(seek_bar_button_listener);
		
		Button rating_bar_button = (Button) findViewById(R.id.rating_bar_button);
		rating_bar_button.setOnClickListener(rating_bar_button_listener);
		
		Button image_view_button1 = (Button) findViewById(R.id.image_view_button1);
		image_view_button1.setOnClickListener(image_view_button_listener1);
		
		Button image_view_button2 = (Button) findViewById(R.id.image_view_button2);
		image_view_button2.setOnClickListener(image_view_button_listener2);
		

		Button image_show_button1 = (Button) findViewById(R.id.image_show_button1);
		image_show_button1.setOnClickListener(image_show_button_listener1);
		
		Button image_show_button2 = (Button) findViewById(R.id.image_show_button2);
		image_show_button2.setOnClickListener(image_show_button_listener2);

		Button grid_view_button = (Button) findViewById(R.id.grid_view_button);
		grid_view_button.setOnClickListener(grid_view_button_listener);
			
		Button tab_demo_button = (Button) findViewById(R.id.tab_demo_button);
		tab_demo_button.setOnClickListener(tab_demo_button_listener);
		
		
		 
	}

 

	private Button.OnClickListener button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			setTitle("哎呦,button被点了一下");
		}
	};
	
	private Button.OnClickListener button_toggle_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ToggleButtonActivity.class);
			startActivity(intent);
		}
	};
 
	private Button.OnClickListener text_view_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ViewTextActivity.class);
			startActivity(intent);
		}
	};
	private Button.OnClickListener edit_view_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, EditTextActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener check_box_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, CheckBoxActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener radio_group_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, RadioGroupActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener spinner_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, SpinnerActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener auto_complete_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, AutoCompleteTextViewActivity.class);
			startActivity(intent);
		}
	};

	private Button.OnClickListener date_picker_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, DatePickerActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener time_picker_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, TimePickerActivity.class);
			startActivity(intent);
		}
	};
	
	
	private Button.OnClickListener progress_bar_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ProgressBarActivity.class);
			startActivity(intent);
		}
	};

	private Button.OnClickListener seek_bar_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, SeekBarActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener rating_bar_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, RatingBarActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener image_view_button_listener1 = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ImageViewActivity1.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener image_view_button_listener2 = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ImageViewActivity2.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener image_show_button_listener1 = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ImageShowActivity1.class);
			startActivity(intent);
		}
	};

	private Button.OnClickListener image_show_button_listener2 = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, ImageShowActivity2.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener grid_view_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, GridViewActivity.class);
			startActivity(intent);
		}
	};
	
	private Button.OnClickListener tab_demo_button_listener = new Button.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, TabDemoActivity.class);
			startActivity(intent);
		}
	};
	
	
}