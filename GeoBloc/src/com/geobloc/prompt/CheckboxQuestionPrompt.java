package com.geobloc.prompt;

import android.util.Log;

import com.geobloc.handlers.AttributeTag;
import com.geobloc.shared.Utilities;
import com.geobloc.shared.Utilities.QuestionType;

public class CheckboxQuestionPrompt extends QuestionPrompt {
	private static final String TAG = "ButtonQuestionPrompt";
	
	String title;
	
	String action;
	
	/* CheckBox state (0-No, 1-Yes) */
	int state = 0;
	
	public CheckboxQuestionPrompt (String titleText, AttributeTag att) {
		
		if (att.attMap.containsKey(Utilities.ATTR_ID)) {
			this.setQuestionId(att.attMap.get(Utilities.ATTR_ID));
		} else {
			Log.e(TAG, "<"+titleText+"> has not ID");
		}
		
		if (att.attMap.containsKey(Utilities.ATTR_ACTION)) {
			this.setAction(att.attMap.get(Utilities.ATTR_ACTION));
		}
		
		this.setTitle(titleText);
		this.setType();
	}
	
	@Override
	public void setType() {
		type = QuestionType.GB_CHECKBOX;	
	}
	
	/**
	 * Sets the text on the label
	 * @param name
	 */
	public void setTitle (String name) {
		title = name;
	}
	
	public String getTitle () {
		return this.title;
	}
	
	public String getButtonTitle () {
		return title;
	}
	
	private void setAction (String mAction) {
		this.action = mAction;
	}
	
	public String getAction () {
		return this.action;
	}

	private void setValue (int value) {
		this.state = value;
	}
	
	private void setValue (Object value) {
		Integer in = (Integer) value;
		this.state = in;
	}
	
	private int getValue () {
		return this.state;
	}
	
	@Override
	public Object getAnswer() {
		return getValue();
	}

	@Override
	public void setAnswer(Object answer) {
		setValue (answer);
	}
}
