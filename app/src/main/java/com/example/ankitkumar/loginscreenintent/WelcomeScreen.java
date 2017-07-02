package com.example.ankitkumar.loginscreenintent;

        import android.app.Activity;
        import android.os.Bundle;
        import android.widget.TextView;

/**
 * Created by Ankit Kumar on 7/2/2017.
 */


public class WelcomeScreen extends Activity {

    TextView   welcomeMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        welcomeMsg=(TextView)findViewById(R.id.welcomeName);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            welcomeMsg.setTextSize(25.00f);
            welcomeMsg.setText("Welcome "+bundle.getString(MainActivity.BUNDLE_KEY_NAME));
        }
    }
}

