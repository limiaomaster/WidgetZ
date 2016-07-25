package m.usewidget;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setTitle("ToggleButtonActivity");
		setContentView(R.layout.togglebutton);
		
		ToggleButton tog_btn1 = (ToggleButton) findViewById(R.id.toggleButton1);
		ToggleButton tog_btn2 = (ToggleButton) findViewById(R.id.toggleButton2);
		final ImageView image_tog = (ImageView) findViewById(R.id.imageView_toggle);
		
		tog_btn1.setTextOff("关闭");
		tog_btn1.setTextOn("打开");
		tog_btn1.setChecked(true);
		tog_btn1.setBackgroundDrawable(getResources().getDrawable(R.drawable.icon));
		
		tog_btn2.setTextOff("关闭");
		tog_btn2.setTextOn("打开");
		tog_btn2.setChecked(true);
		
		tog_btn2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(),"lalala"	, Toast.LENGTH_SHORT).show();
				Toast msg;
				msg = Toast.makeText(getApplicationContext(),"我爱你，摸摸哒~~", Toast.LENGTH_SHORT);
				msg.setGravity(Gravity.CENTER, 0,0);
				LinearLayout toastView = (LinearLayout) msg.getView();
				ImageView imageCodeProject = new ImageView (getApplicationContext());
				imageCodeProject.setImageResource(R.mipmap.jiangyuchen_love);
				toastView.addView(imageCodeProject,0);
				msg.show();
			}
		});
		
		tog_btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked)
					image_tog.setImageResource(R.drawable.jiangyuchen_1lj);
				else
					image_tog.setImageResource(R.drawable.jiangyuchen_2lj);
			}
		});
	}
}