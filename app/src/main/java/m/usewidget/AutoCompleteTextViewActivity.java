package m.usewidget;


import m.usewidget.R;

import javax.security.auth.PrivateCredentialPermission;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutoCompleteTextViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.autocomplete);
	    setTitle("AutoCompleteTextViewActivity");
	       
	    //用String产生适配器ArryAdapter
	    ArrayAdapter<String> Adp_acp_state = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, AUTO_STATE);
	    //找到自动完成文本框
	    AutoCompleteTextView ACP_textview = (AutoCompleteTextView) findViewById(R.id.auto_complete);
	    //为自动完成文本框设置适配器
	    ACP_textview.setAdapter(Adp_acp_state);
	    //为自动完成文本框设置匹配字符数
	    ACP_textview.setThreshold(1);
	    //设置提示信息
	    ACP_textview.setCompletionHint("单击符合的一项");
	    //设置背景颜色  颜色都在res/values/colors.xml
	    ACP_textview.setDropDownBackgroundResource(R.color.lightyellow);
	    //设置适配器的宽高
	    //ACP_textview.setDropDownWidth(100);
	    ACP_textview.setDropDownHeight(250);
	    //设置监听器
	    ACP_textview.setOnItemClickListener(new OnItemClickListener() {
	    
	    	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
	        	Toast.makeText(getApplicationContext(), "您选择的是："+arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
				}
			});
	        
	    }
	   
	static final String[] AUTO_STATE = new String[] {
		"Belarus","Britain","China" ,"Colombia","Cuba", "Russia", "Romania","Rwanda", 
		"中国","中国香港","中国香港中环","中国香港湾仔","中国香港湾仔警署",
		"中国台湾","中国台湾台北","中国台湾台北西门町"
	    };
	
}
