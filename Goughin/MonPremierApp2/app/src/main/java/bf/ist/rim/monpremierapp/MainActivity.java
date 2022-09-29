package bf.ist.rim.monpremierapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String login = bundle.getString("login");
        String password = bundle.getString("password");

        TextView affichage = (TextView) findViewById(R.id.affichage);

        affichage.setText("ID = " +login +" Mdp="+ password);

       /* Locale locale =new Locale("fr_FR");
        Locale.setDefault(locale);
        Configuration config= new Configuration();
        config.locale=locale;
        getApplicationContext().getApplicationContext().getResources().updateConfiguration(config, null);
   */
    }
}