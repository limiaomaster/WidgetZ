/* 
 * Copyright (C) 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package m.usewidget;


import m.usewidget.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class RadioGroupActivity extends Activity implements View.OnClickListener {
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radio_group);
        setTitle("RadioGroupActivity");
        
        mRadioGroup = (RadioGroup) findViewById(R.id.menu);
        final RadioButton Radio_btn1 = (RadioButton) findViewById(R.id.radio1);
        final RadioButton Radio_btn2 = (RadioButton) findViewById(R.id.radio2);
        final RadioButton Radio_btn3 = (RadioButton) findViewById(R.id.radio3);
        final RadioButton Radio_btn4 = (RadioButton) findViewById(R.id.radio4);
        mRadioGroup.check(R.id.radio2);
        
        Button clearButton = (Button) findViewById(R.id.clear);
        clearButton.setOnClickListener(this);
        //OnCheckedChangeListener mmm = null;
		mRadioGroup.setOnCheckedChangeListener(  new RadioGroup.OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				String show = "";
				if(checkedId==Radio_btn1.getId())
					show = (String) Radio_btn1.getText(); 
				else if(checkedId==Radio_btn2.getId())
					show = (String)Radio_btn2.getText(); 
				else if(checkedId==Radio_btn3.getId())
					show = (String)Radio_btn3.getText(); 
				else if(checkedId==Radio_btn4.getId())
					show = (String)Radio_btn4.getText(); 
				Toast.makeText(getApplicationContext(), "你最喜欢吃的食物是："+show, Toast.LENGTH_SHORT).show();
			}
		});
		
    }
    

 

    public void onClick(View v) {
        mRadioGroup.clearCheck();
    }
}
