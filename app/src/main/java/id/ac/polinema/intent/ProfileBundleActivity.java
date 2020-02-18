package id.ac.polinema.intent;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";

    private TextView username;
    private TextView name;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        username = findViewById(R.id.text_username);
        name = findViewById(R.id.text_name);
        age = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            username.setText(extras.getString(USERNAME_KEY));
            name.setText(extras.getString(NAME_KEY));
            age.setText(String.valueOf(getIntent().getIntExtra(AGE_KEY, 0)));
        }
    }
}
