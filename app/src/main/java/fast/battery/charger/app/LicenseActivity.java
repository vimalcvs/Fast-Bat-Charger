package fast.battery.charger.app;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class LicenseActivity extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout layout;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_license);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("License");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        layout = (LinearLayout) findViewById(R.id.BannerAd);
        AdSettings.addTestDevice("61dc0d19895f5c64f7013fa7ee898521");
        adView = new AdView(this, getResources().getString(R.string.Ad_Licence_banner), AdSize.BANNER_HEIGHT_50);
        layout.addView(adView);
        adView.loadAd();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
