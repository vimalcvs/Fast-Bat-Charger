package fast.battery.charger.app.prefrence;


import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.preference.PreferenceCategory;

public class mPreferenceCatagory extends PreferenceCategory {


    public mPreferenceCatagory(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public mPreferenceCatagory(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public mPreferenceCatagory(Context context) {
        super(context);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        TextView titleView = (TextView) view.findViewById(android.R.id.title);
        titleView.setTextColor(Color.parseColor("#FF9800"));
    }
}
