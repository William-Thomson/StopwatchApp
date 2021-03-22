package au.edu.jcu.cp3406.stopwatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SettingsActivity extends AppCompatActivity {

    public static int SETTINGS_REQUEST = 1234;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        editText = findViewById(R.id.speed);
    }

    public void doneClicked(View view) {
        String text = editText.getText().toString();

        int speed = Integer.parseInt(text);

        Intent data = new Intent();
        data.putExtra("speed", speed);
        setResult(RESULT_OK, data);
        finish();
    }
}