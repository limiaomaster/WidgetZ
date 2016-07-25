package m.usewidget;

import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;

public class ImageViewActivity2 extends Activity {
	CheckBox plain_cb;
	CheckBox serif_cb;
	CheckBox italic_cb;
	CheckBox bold_cb;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("ImageViewActivity");
		setContentView(R.layout.image_view2);
//		find_and_modify_text_view();
		
		/*ImageView image =(ImageView)findViewById(R.id.imageView2);
		image.setImageResource(R.drawable.jiangyuchen_11sj);
		image.setAlpha(255);
		//image.setScaleType(ScaleType.FIT_XY);
*/
	
	}

}