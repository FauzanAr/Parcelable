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

        Biodata bio = getIntent().getParcelableExtra("BIODATA");

        nameOutput = findViewById(R.id.textName);
        emailOutput = findViewById(R.id.textEmail);
        numberOutput = findViewById(R.id.textNumber);

        nameOutput.setText(""+bio.getNama());
        emailOutput.setText(""+bio.getEmail());
        numberOutput.setText(String.valueOf(bio.getNomor()));
    }

}
