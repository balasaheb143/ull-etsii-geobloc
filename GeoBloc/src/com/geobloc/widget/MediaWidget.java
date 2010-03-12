package com.geobloc.widget;

import com.geobloc.R;
import com.geobloc.prompt.CheckboxQuestionPrompt;
import com.geobloc.prompt.DataInputQuestionPrompt;
import com.geobloc.prompt.QuestionPrompt;
import com.geobloc.shared.Utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MediaWidget extends RelativeLayout implements QuestionWidget {
	
	private static final int REQUEST_CAMERA = 0;
	
	Context mContext;
	
	LayoutInflater inflater;
	
	public MediaWidget(Context context, ViewGroup parent) {
		super(context);
		
		mContext = context;
		
		/*inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.gallery, null);*/
		/*inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.gallery, null);*/
				
		/* As� funciona, pero a�ade un Nivel mas en la jerarqu�a */
		inflate(context, R.layout.gallery, this);
        Button but = (Button)findViewById(R.id.takePhotoButton);
        but.setText("Hacer foto");
        but = (Button)findViewById(R.id.loadFromGalleryButton);
        but.setText("A�adir foto desde galeria");
        but = (Button)findViewById(R.id.clearButton);
        but.setText("Borrar fotos");
	}

	public MediaWidget(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		
		mContext = context;
	}

	/*public ButtonWidget(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}*/
	
	public void buildView (QuestionPrompt qP) {

        
	}
	
	public void buildViewParent (ViewGroup parent) {
		//inflate(mContext, R.layout.gallery, parent);
		
        /*Button but = (Button)findViewById(R.id.takePhotoButton);
        but.setText("Hacer foto");*/
	}

	@Override
	public void clearAnswer() {
		// TODO Auto-generated method stub
		
	}
	
}
