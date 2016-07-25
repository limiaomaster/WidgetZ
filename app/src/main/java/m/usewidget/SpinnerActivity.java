package m.usewidget;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends Activity {
	
	Spinner spinner_province;
	Spinner spinner_state;
	Spinner spinner_planet;
	
	private ArrayAdapter<String> ArryAdp_province;
	private List<String> Arr_province;

	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("SpinnerActivity");
		setContentView(R.layout.spinner);
		find_and_modify_view();
	}
	 
	private static final String[] mCountries = { "河南" ,"四川", "广东","新疆", "海南", "浙江" };

	private void find_and_modify_view() {
		Arr_province = new ArrayList<String>();
		 
		for (int i = 0; i < mCountries.length; i++) {
			Arr_province.add(mCountries[i]);
		}
		//找到下拉列表，赋给相应的Spinner变量
		spinner_province = (Spinner) findViewById(R.id.spinner_1);
		spinner_state = (Spinner) findViewById(R.id.spinner_2);
		spinner_planet = (Spinner) findViewById(R.id.spinner_3);
		
		//用ArrayList产生适配器province
		ArryAdp_province = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Arr_province);
		ArryAdp_province.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	
		//用xml产生适配器state
        ArrayAdapter<CharSequence> Adp_state = ArrayAdapter.createFromResource(this, R.array.Arr_state, android.R.layout.simple_spinner_item);
        Adp_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       
        //用xml产生适配器planet
        ArrayAdapter<CharSequence> Adp_planet = ArrayAdapter.createFromResource(this, R.array.Arr_planet, android.R.layout.simple_spinner_item);
        Adp_planet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        //为下拉列表设置标题
		spinner_province.setPromptId(R.string.select_your_province);
		spinner_state.setPromptId(R.string.select_your_state);
		spinner_planet.setPromptId(R.string.select_your_planet);  
		
        //为下拉列表设置相应的适配器
    	spinner_province.setAdapter(ArryAdp_province);
    	spinner_state.setAdapter(Adp_state);
    	spinner_planet.setAdapter(Adp_planet);
        
		//为下拉列表province设置选择后的浮动消息
		AdapterView.OnItemSelectedListener Your_province = new AdapterView.OnItemSelectedListener() {
			public void onItemSelected (AdapterView<?> arg0, View arg1 ,int arg2, long arg3 ) {
			Toast.makeText(SpinnerActivity.this, "您选择的省份是："+ arg0.getItemAtPosition(arg2).toString(),Toast.LENGTH_LONG).show();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(SpinnerActivity.this, "您没有选择任何省份！", Toast.LENGTH_LONG).show();
			}	
		};
		
		//为下拉列表state设置选择后的浮动消息
		AdapterView.OnItemSelectedListener Your_state = new AdapterView.OnItemSelectedListener() {
			public void onItemSelected (AdapterView<?> arg0, View arg1 ,int arg2, long arg3 ) {
			Toast.makeText(SpinnerActivity.this, "您选择的国家是："+ arg0.getItemAtPosition(arg2).toString(),Toast.LENGTH_LONG).show();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(SpinnerActivity.this, "您没有选择任何国家！", Toast.LENGTH_LONG).show();
			}	
		};
		
		//为下拉列表planet设置选择后的浮动消息
		AdapterView.OnItemSelectedListener Your_planet = new AdapterView.OnItemSelectedListener() {
			public void onItemSelected (AdapterView<?> arg0, View arg1 ,int arg2, long arg3 ) {
			Toast.makeText(SpinnerActivity.this, "您选择的星球是："+ arg0.getItemAtPosition(arg2).toString(),Toast.LENGTH_LONG).show();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(SpinnerActivity.this, "您没有选择任何星球！", Toast.LENGTH_LONG).show();
			}	
		};
		//也是设置监听器，只不过与上面的分开写了。
		spinner_province.setOnItemSelectedListener(Your_province);
		spinner_state.setOnItemSelectedListener(Your_state);
		spinner_planet.setOnItemSelectedListener(Your_planet);
	}
 
}