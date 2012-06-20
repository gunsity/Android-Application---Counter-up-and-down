package com.winchester.counterapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MyCounterAppActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //set up the widgets
        final Button btn_count = (Button)findViewById(R.id.button1);
        final RadioGroup rg_select = (RadioGroup)findViewById(R.id.selectCounter);
        final EditText txt_num = (EditText)findViewById(R.id.editText1);
        
        OnClickListener ocl = new OnClickListener()
        {
			@Override
			public void onClick(View arg0) 
			{
				//get the selected radio button
				int selectedCount = rg_select.getCheckedRadioButtonId();
				String strNumber = txt_num.getText().toString();
				int num = Integer.parseInt(strNumber);

				switch(selectedCount)
				{
					case R.id.countUP:
					{
						num = num + 1;
						txt_num.setText(Integer.toString(num));
						break;
					}
					case R.id.countDOWN:
					{
						num = num - 1;
						txt_num.setText(Integer.toString(num));
						break;
					}
					default:
					{
						break;
					}
				
				}
				
			}
        	
        };
       btn_count.setOnClickListener(ocl);
    }

}