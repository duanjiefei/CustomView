package com.djf.customview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
//	private List<String> lists;
//	
//	private MarqueeView mv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		DisplayConfig.setResolutionAndDpiDiv(getApplicationContext());
//		
//	
//		//mv = (MarqueeView) findViewById(R.id.mv);
//		mv = new MarqueeView(this);
//		lists = new ArrayList<String>();
//		lists.add("1 举头望明月");
//		lists.add("2 低头思故乡");
//		mv.startWithTextList(lists);
//		
//		setContentView(mv);
		
//		StepView sv = new StepView(this);
////		LinearLayout.LayoutParams lp  = new LayoutParams(DisplayConfig.getResolutionValue(1000),DisplayConfig.getResolutionValue(500));
////		lp.gravity = Gravity.CENTER;
////		sv.setLayoutParams(lp);
////		
//		
//		setContentView(sv);
		
        setContentView(R.layout.activity_main);
        showSetpView0();
       showSetpView1();
        showSetpView2();
        showSetpView3();
        showSetpView4();
        showSetpView5();
        showSetpView6();
		
	}
	
	
	private void showSetpView0()
    {
        StepView setpview0 = (StepView) findViewById(R.id.step_view0);
        List<String> list0 = new ArrayList<>();
        list0.add("接单");
        list0.add("打包");
        list0.add("出发");
        list0.add("送单");
        list0.add("完成");
        list0.add("支付");
        setpview0.setStepsViewIndicatorComplectingPosition(2)//设置完成的步数
                .setStepViewTexts(list0)//总步骤
                .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }


    private void showSetpView1()
    {
        List<String> list1 = new ArrayList<>();
        list1.add("接单");
        StepView setpview1 = (StepView) findViewById(R.id.step_view1);
        setpview1.setStepsViewIndicatorComplectingPosition(0)//设置完成的步数
                .setStepViewTexts(list1)//总步骤
                .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }

    private void showSetpView2()
    {
        List<String> list2 = new ArrayList<>();
        list2.add("接单");
        list2.add("打包");
        StepView setpview2 = (StepView) findViewById(R.id.step_view2);
        setpview2.setStepsViewIndicatorComplectingPosition(0)//设置完成的步数
        .setStepViewTexts(list2)//总步骤
        .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
        .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
        .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
        .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }

    private void showSetpView3()
    {
        List<String> list3 = new ArrayList<>();
        list3.add("接单");
        list3.add("打包");
        list3.add("出发");
        StepView setpview3 = (StepView) findViewById(R.id.step_view3);
        setpview3.setStepsViewIndicatorComplectingPosition(1)//设置完成的步数
        .setStepViewTexts(list3)//总步骤
        .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
        .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
        .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
        .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }

    private void showSetpView4()
    {
        List<String> list4 = new ArrayList<>();
        list4.add("接单");
        list4.add("打包");
        list4.add("出发");
        list4.add("送单");
        StepView setpview4 = (StepView) findViewById(R.id.step_view4);
        setpview4.setStepsViewIndicatorComplectingPosition(2)//设置完成的步数
        .setStepViewTexts(list4)//总步骤
        .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
        .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
        .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
        .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon


    }

    private void showSetpView5()
    {
        List<String> list5 = new ArrayList<>();
        list5.add("接单");
        list5.add("打包");
        list5.add("出发");
        list5.add("送单");
        list5.add("完成");
        StepView setpview5 = (StepView) findViewById(R.id.step_view5);
        setpview5.setStepsViewIndicatorComplectingPosition(3)//设置完成的步数
        .setStepViewTexts(list5)//总步骤
        .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
        .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
        .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
        .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }

    private void showSetpView6()
    {
        StepView setpview6 = (StepView) findViewById(R.id.step_view6);

        List<String> list6 = new ArrayList<>();
        list6.add("接单");
        list6.add("打包");
        list6.add("出发");
        list6.add("送单");
        list6.add("完成");
        list6.add("支付");
        setpview6.setStepsViewIndicatorComplectingPosition(4)//设置完成的步数
        .setStepViewTexts(list6)//总步骤
        .setStepsViewIndicatorCompletedLineColor(Color.WHITE)//设置StepsViewIndicator完成线的颜色
        .setStepsViewIndicatorUnCompletedLineColor("#F8F8F8")//设置StepsViewIndicator未完成线的颜色
        .setStepViewComplectedTextColor(Color.WHITE)//设置StepsView text完成线的颜色
        .setStepViewUnComplectedTextColor("#F8F8F8")//设置StepsView text未完成线的颜色
        .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.complted))//设置StepsViewIndicator CompleteIcon
        .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
        .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getBaseContext(), R.drawable.attention));//设置StepsViewIndicator AttentionIcon
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        getMenuInflater().inflate(R.menu.menu_draw_canvas, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        if(item.getItemId() == R.id.action_drawcanvas)
//        {
//            Intent intent = new Intent(this,DrawCanvasActivity.class);
//            startActivity(intent);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
