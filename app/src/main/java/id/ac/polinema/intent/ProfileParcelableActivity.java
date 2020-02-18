package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private TextView username;
    private TextView name;
    private TextView age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        username = findViewById(R.id.text_username);
        name = findViewById(R.id.text_name);
        age = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            User data = getIntent().getParcelableExtra(USER_KEY);
            username.setText(data.getUsername());
            name.setText(data.getName());
            age.setText(String.valueOf(data.getAge()));
        }
    }
}
