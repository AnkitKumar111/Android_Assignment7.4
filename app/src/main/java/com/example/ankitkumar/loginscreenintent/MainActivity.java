package com.example.ankitkumar.loginscreenintent;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;


public class MainActivity extends Activity {

    private Button btnLogin;
    private EditText inputEmail;
    private EditText inputPassword;

    static String BUNDLE_KEY_NAME="BUNDLE_KEY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);


        // Login button Click Event
        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String email = inputEmail.getText().toString();
                String password = inputPassword.getText().toString();

                // Check for empty data in the form
                if (email.trim().isEmpty()) {
                    // login user
                    inputEmail.setError("Enter E-Mail...");
                }
                else if(password.trim().isEmpty()){
                    inputPassword.setError("Enter Password...");
                }
                else {
                    Toast.makeText(getApplicationContext(), "checking password", Toast.LENGTH_LONG).show();
                    if (email.equals("ankit@acadgild.com") && password.equals("acadgild2017")) {

                        Intent intent = new Intent(MainActivity.this, WelcomeScreen.class);

                        Bundle bundle = new Bundle();
                        bundle.putString(BUNDLE_KEY_NAME, inputEmail.getText().toString());

                        intent.putExtras(bundle);

                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_LONG).show();
                    }

                }
            }

        });
    }


}
