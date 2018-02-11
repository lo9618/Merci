package lo9618.dinesocial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


class StartPage extends AppCompatActivity {

    Button getHelp, journal, settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        getHelp = (Button) findViewById(R.id.get_help);
        journal = (Button) findViewById(R.id.journal);
        settings = (Button) findViewById(R.id.settings);

        // Get help button
        getHelp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toGetHelp();
            }
        });

        // Journal button
        journal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toJournal();
            }
        });

        // Settings button
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                toSettings();
            }
        });
    }

    private void toSettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    private void toJournal() {
        Intent intent = new Intent(this, Journal.class);
        startActivity(intent);
    }

    private void toGetHelp() {
        Intent intent = new Intent(this, GetHelp.class);
        startActivity(intent);
    }
}
