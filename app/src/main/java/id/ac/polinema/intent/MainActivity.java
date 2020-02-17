package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleParcelable(View view) {
        Intent i =  new Intent(MainActivity.this, ParcelableActivity.class);
        startActivity(i);
    }

    public void handleBundle(View view) {
        Intent i =  new Intent(MainActivity.this, BundleActivity.class);
        startActivity(i);
    }

    public void handleImplicit(View view) {
        Intent i =  new Intent(MainActivity.this, ImplicitIntentActivity.class);
        startActivity(i);
    }

    public void handleExplicit(View view) {
        Intent i =  new Intent(MainActivity.this, ExplicitIntentActivity.class);
        startActivity(i);
    }
}
