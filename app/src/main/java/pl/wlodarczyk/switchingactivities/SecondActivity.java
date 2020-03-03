package pl.wlodarczyk.switchingactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.value);
        String message = getIntent().getStringExtra("name");
        textView.setText(message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityThree();
            }
        });
    }

    public void openActivityThree() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }
}
