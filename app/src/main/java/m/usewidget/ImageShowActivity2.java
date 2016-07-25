package m.usewidget;
 
import m.usewidget.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.widget.Gallery.LayoutParams;

public class ImageShowActivity2 extends Activity { //implements AdapterView.OnItemSelectedListener, ViewSwitcher.ViewFactory {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.image_show2);
        setTitle("Gallery_Activity");
        
        final int[] images = {
        		R.mipmap.baiyun1,
        		R.mipmap.baiyun2,
        		R.mipmap.baiyun3,
        		R.mipmap.baiyun4,
        		R.mipmap.baiyun5,
        		R.mipmap.jiangyuchen3,
        		R.mipmap.jiangyuchen4,
        		R.mipmap.jiangyuchen5,
        		R.mipmap.jiangyuchen6
        		};
        final Gallery g1 = (Gallery) findViewById(R.id.gallery1);
        
        //新建一个适配器adapter
        BaseAdapter adapter = new BaseAdapter() {
        	
        	int mGalleryItemBackground;
        	public void BaseAdapter(Context context){
                 
                TypedArray typedArray= obtainStyledAttributes(R.styleable.Gallery);
                mGalleryItemBackground = typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground, 0);
                typedArray.recycle();
            }

        	 
        	
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public int getCount() {
				// TODO Auto-generated method stub
				//return images.length;
				return Integer.MAX_VALUE;
			}
			
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				ImageView iv =new ImageView (ImageShowActivity2.this);
			
				int mod_img = images[position%images.length];
				iv.setImageResource(mod_img);//放置的图片不能太大，太大会OOM。out of memery。
				
				iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
				iv.setBackgroundResource(mGalleryItemBackground);
				
				return iv;	
			}
		};
		//为画廊g1设置适配器
		g1.setAdapter(adapter);
		//图像之间的间距
		g1.setSpacing(60);
		
		g1.setGravity(Gravity.CLIP_HORIZONTAL);
		g1.setAnimationDuration(400);
		g1.setUnselectedAlpha((float)1.2);
		
		//为画廊g1设置监听器
		g1.setOnItemClickListener(i_clc_lsnr);  
        
    }//onCreate函数结束
    
    OnItemClickListener i_clc_lsnr = new OnItemClickListener() {
    	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "您选择的图片是第"+position+"号图片", Toast.LENGTH_SHORT).show();
		}
	};
    
    
}