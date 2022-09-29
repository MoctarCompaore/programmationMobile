package bf.ist.rim.monpremierapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       /*  Button b = (Button) findViewById(R.id.btnConnect);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("tag","Bouton clique" );
            }
        });*/

  }

    public void clique(View v) {
        Button b = (Button) v; // on force le view à devenir un bouton
        Log.i("tag", "Bouton cliqué".concat(b.getText().toString()));

        Toast t = Toast.makeText( this, "message...", Toast.LENGTH_SHORT) ;
        t.show();


        //on acceder à la valeur Editext  login
        EditText login= (EditText)  findViewById(R.id.login);

        //on recupére le mot de passe
        EditText password= (EditText)  findViewById(R.id.password) ;


        Log.i("tag","login== ".concat(login.getText().toString()));
        Log.i("tag","password== "+password.getText().toString());

        String  l="gounghin";
        String p = "IST";


        Log.i( "this", "test1"+l.equals(login.getText().toString()) );
        Log.i( "this", "test2"+p.equals(password.getText().toString()) );




        if( l.equals(login.getText().toString())  || p.equals(password.getText().toString())) {
            Toast t2 = Toast.makeText( this, "Ok", Toast.LENGTH_SHORT) ;
            t2.show();

            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("login","gounghin");
            bundle.putString("password","IST");

            intent.putExtras(bundle);
            startActivity(intent);
        } else {
            Toast t2 = Toast.makeText( this, "Non", Toast.LENGTH_SHORT) ;
            t2.show();

        }

    }

}