package bf.ist.rmi.programme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

                    message.setText("Succes !! ");
                    message.setBackgroundResource(R.color.green);
                } else {
                    Log.i("tag", " ECHEC !!!");

                    message.setText("Echec !! ");
                    message.setBackgroundResource(R.color.red);
                }
                //Log.i("tag", "bouton Login cliqué!!!");
            }
        });
    }
}