package bf.ist.rmi.programme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText userName = (EditText)  findViewById(R.id.username);
                EditText passWord = (EditText)  findViewById(R.id.password);

                String un= userName.getText().toString();
                String pw= passWord.getText().toString();
                TextView message = (TextView)  findViewById(R.id.message);
                message.setVisibility(View.VISIBLE);
                if("Trilogie".equals(un) && "Wayalghin".equals(pw)) {
                    Log.i("tag", " SUCCESS !!!");

                    Toast t = Toast.makeText(getApplicationContext(), R.string.msg_succes, Toast.LENGTH_SHORT);
                    t.show();
                    message.setText(R.string.msg_succes);

                    message.setBackgroundResource(R.color.green);



                    // Instancier l'objet module
                    Module m =  new Module();
                    m.setLibelle("Programmation Mobile");
                    m.setDuree(50);
                    m.setDescription("Developpement d'application pour android");

                    //instanciation du bundle
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("obj",m);

                    // intancation de l'intent
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtras(bundle); // on attache le bundle  à l'intent

                    startActivity(intent); // on lance l'appel

                } else {
                    Log.i("tag", " ECHEC !!!") ;
                    Toast t = Toast.makeText(getApplicationContext(), "Echec !! ", Toast.LENGTH_SHORT);
                    t.show();
                    message.setText("Echec !! ");
                    message.setBackgroundResource(R.color.red);
                }
                //Log.i("tag", "bouton Login cliqué!!!");
            }
        });
    }
}