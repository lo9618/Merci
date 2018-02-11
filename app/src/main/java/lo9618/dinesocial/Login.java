package lo9618.dinesocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fill out all data field", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.getText().toString().equals("u") &&
                            password.getText().toString().equals("p")) {
                        welcome();
                        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "No user found", Toast.LENGTH_SHORT).show();

                    }
                }
            }

        });
    }

    private void welcome() {
        Intent intent = new Intent(this, StartPage.class);
        startActivity(intent);
    }
}
