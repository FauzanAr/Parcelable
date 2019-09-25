package android.jplas.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private TextView nameOutput;
    private TextView emailOutput;
    private TextView numberOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        biodata bio = getIntent().getParcelableExtra("BIODATA");

        nameOutput = findViewById(R.id.nameText);
        emailOutput = findViewById(R.id.emailText);
        numberOutput = findViewById(R.id.numberText);

        nameOutput.setText(bio.getNama());
        emailOutput.setText(bio.getEmail());
        numberOutput.setText(""+bio.getNomor());
    }

}
