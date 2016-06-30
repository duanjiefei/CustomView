package com.djf.customview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MarqueeView extends ViewFlipper{
	
	private Context mContext;
	private List<String> notice;
	private int textSize;

	public MarqueeView(Context context) {
		this(context,null);
		notice  = new ArrayList<String>();
	}

	public MarqueeView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context,attrs,0);
	}

	private void init(Context context, AttributeSet attrs, int defStyle) {
		this.mContext = context;
		TypedArray array =  context.obtainStyledAttributes(attrs, R.styleable.MarqueeViewStyle, 0, 0);
		textSize = array.getInt(R.styleable.MarqueeViewStyle_mvTextSize,DisplayConfig.getDpiValue(24));
		array.recycle();
	}
	
	
	public void startWithTextList(List<String> notice){
		setNotice(notice);
		start(notice);
	}
	
	private boolean start(List<String> notice){
		if(notice == null || notice.size() == 0){
			return false;
		}
		
		for(int i = 0; i < notice.size(); i++){
			TextView tv  = createTextview(notice.get(i));
			addView(tv);
		}
		
		if(notice.size() > 0){
			startFlipping();
		}
		return true;
	}
	
	public void setNotice(List<String> notice){
		this.notice = notice;
	}
	
	private TextView createTextview(String text){
		TextView tv = new TextView(mContext);
		tv.setTextSize(textSize);
		tv.setText(text);
		return tv;
	}
	
	
	
	
	







}
