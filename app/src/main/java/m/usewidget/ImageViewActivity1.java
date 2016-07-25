package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ImageViewActivity1 extends Activity {
	CheckBox plain_cb;
	CheckBox serif_cb;
	CheckBox italic_cb;
	CheckBox bold_cb;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("ImageViewActivity");
		setContentView(R.layout.image_view1);

		
		SeekBar myseekBar1 = (SeekBar)findViewById(R.id.seekBar1);
		SeekBar myseekBar2 = (SeekBar)findViewById(R.id.seekBar2);
		
		final ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
		
		final TextView textview1 = (TextView)findViewById(R.id.textView1);
		final TextView textview2 = (TextView)findViewById(R.id.textView2);
		 
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		//myseekBar1.setMax(dm.widthPixels - minWith);
		
		myseekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "停止滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "开始滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				int newWidth = progress;
				int newHeigh = (int)(newWidth*3/4);
				imageView1.setLayoutParams(new LinearLayout.LayoutParams(newWidth,newHeigh));
				 
				textview1.setText("图像的宽度："+newWidth+"图像的高度："+newHeigh);
			}
		});

		myseekBar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "停止滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				//Toast.makeText(getApplicationContext(), "开始滑动", Toast.LENGTH_SHORT).show();
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				// TODO Auto-generated method stub
				Bitmap bitmap = ( (BitmapDrawable) getResources().getDrawable(R.drawable.jiangyuchen_2sj)).getBitmap();
				Matrix matrix = new Matrix();
				Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
				matrix.setRotate(progress);
				bitmap = Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth(),bitmap.getHeight(),matrix,true);
				imageView1.setImageBitmap(bitmap);
				textview2.setText(progress+"度");
			}
		});
	}

	
}