package android.jplas.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputNama;
    private EditText inputEmail;
    private EditText inputNomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNama = findViewById(R.id.nameText);
        inputEmail = findViewById(R.id.emailText);
        inputNomor = findViewById(R.id.numberText);
    }


    public void displayActivity(View view) {
        String nama = inputNama.getText().toString();
        String email = inputEmail.getText().toString();
        int nomor = Integer.parseInt(inputNomor.getText().toString());
        Intent intent =  new Intent(this, DisplayActivity.class);
        startActivity(intent);
    }
}
