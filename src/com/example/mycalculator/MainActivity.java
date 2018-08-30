package com.example.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText etResult;
	private Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9;
	private Button jiaButton,jianButton,chengButton,chuButton,equalButton;
	private Button dotButton,clearButton;
	
	private String a="";
	
	private String result="0";
	//0=初始状态;1=+;2=-;3+*;4=/;
	private static int calculate=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		findView();
		
		num0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(a.length()<17){
					a=a+"0";
					etResult.setText(a);
				}
			}
		});
	
		num1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"1";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"2";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"3";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"4";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
				
			}
		});
		
		num5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"5";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"6";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"7";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"8";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		num9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(a.length()<17){
					a=a+"9";
//					etResult.setText(Double.parseDouble(a)+"");
					if(a.indexOf(".")!=-1){
						etResult.setText(Double.parseDouble(a)+"");
					}else{
						etResult.setText(Long.parseLong(a)+"");
					}
				}
			}
		});
		
		clearButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				etResult.setText("");
				a="";
				result="0";
				calculate=0;
			}
		});
		
		jiaButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				jia();
				myAnimation();
				calculate=1;
			}
		});
		
		jianButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				jian();
				myAnimation();
				calculate=2;
			}
		});
		
		chengButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				cheng();
				myAnimation();
				calculate=3;
			}
		});
		
		chuButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chu();
				myAnimation();
				calculate=4;
			}
		});
		
		equalButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				calculate();
				myAnimation();
			}
		});
		
		dotButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(a.length()<17){
					if(a==""){
						a="0.";
						etResult.setText(a);
					}else{
						if(a.indexOf(".")!=-1){
//							
						}else{
							a=a+".";
							etResult.setText(a);
						}
					}
				}
			}
		});
	}
	
	public void calculate(){
		switch (calculate) {
		case 1:
			jia();
			break;
			
		case 2:
			jian();
			break;
			
		case 3:
			cheng();
			break;

		case 4:
			chu();
			break;

		default:
			break;
		}
	}

	public void jia(){
		if(a.equals("")){
		}else {
			if(a.indexOf(".")!=-1||result.indexOf(".")!=-1){
				result=String.valueOf(Double.parseDouble(a)+Double.parseDouble(result));
			}else{
				result=String.valueOf(Long.parseLong(a)+Long.parseLong(result));
			}
			etResult.setText(result);
			a="";
		}
	}
	
	public void jian(){
		if(a.equals("")){
		}else{
			if(calculate==0){
				if(a.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(a)-Double.parseDouble(result));
				}else{
					result=String.valueOf(Long.parseLong(a)-Long.parseLong(result));
				}
			}else{
				if(a.indexOf(".")!=-1||result.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(result)-Double.parseDouble(a));
				}else{
					result=String.valueOf(Long.parseLong(result)-Long.parseLong(a));
				}
			}
			etResult.setText(result);
			a="";
		}
	}
	
	public void cheng(){
		if(a.equals("")){
		}else{
			if(calculate==0){
				if(a.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(a)*(Double.parseDouble(result)+1));
				}else{
					result=String.valueOf(Long.parseLong(a)*(Long.parseLong(result)+1));
				}
			}else{
				if(a.indexOf(".")!=-1||result.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(a)*Double.parseDouble(result));
				}else{
					result=String.valueOf(Long.parseLong(a)*Long.parseLong(result));
				}
			}
			etResult.setText(result);
			a="";
		}
	}
	
	public void chu(){
		if(a.equals("")){
		}else{
			if(calculate==0){
				if(a.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(a)/(Double.parseDouble(result)+1));
				}else{
					result=String.valueOf(Long.parseLong(a)/(Long.parseLong(result)+1));
				}
			}else{
				if(a.indexOf(".")!=-1||result.indexOf(".")!=-1){
					result=String.valueOf(Double.parseDouble(result)/Double.parseDouble(a));
				}else if(a.indexOf(".")==-1&&result.indexOf(".")==-1){
					if(Long.parseLong(result)%Long.parseLong(a)==0){
						result=String.valueOf(Long.parseLong(result)/Long.parseLong(a));
					}else{
						result=String.valueOf(Double.parseDouble(result)/Double.parseDouble(a));
					}
				}else{
					result=String.valueOf(Double.parseDouble(result)/Double.parseDouble(a));
					}
				}
			etResult.setText(result);
			a="";
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	public void findView(){
		etResult=(EditText)findViewById(R.id.etResult);
		
		num0=(Button)findViewById(R.id.num0);
		num1=(Button)findViewById(R.id.num1);
		num2=(Button)findViewById(R.id.num2);
		num3=(Button)findViewById(R.id.num3);
		num4=(Button)findViewById(R.id.num4);
		num5=(Button)findViewById(R.id.num5);
		num6=(Button)findViewById(R.id.num6);
		num7=(Button)findViewById(R.id.num7);
		num8=(Button)findViewById(R.id.num8);
		num9=(Button)findViewById(R.id.num9);
		
		jiaButton=(Button)findViewById(R.id.plus);
		jianButton=(Button)findViewById(R.id.jian);
		chengButton=(Button)findViewById(R.id.cheng);
		chuButton=(Button)findViewById(R.id.chu);
		equalButton=(Button)findViewById(R.id.equal);
		
		dotButton=(Button)findViewById(R.id.dot);
		clearButton=(Button)findViewById(R.id.clear);
	}
	
	public void myAnimation(){
		// 申明一个AlphaAnimation对象，从完全透明到完全不透明
		AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
		// 设置动画持续时间为50毫秒
		alphaAnimation.setDuration(50);
		// 执行动画前，延迟0.5秒钟
//		alphaAnimation.setStartOffset(500);
		// 启动动画
		etResult.startAnimation(alphaAnimation);
	}
}
