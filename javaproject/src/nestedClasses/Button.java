package nestedClasses;

public class Button {
	private OnClickListener listener;
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	interface OnClickListener{
		void onClick();
	}

}
