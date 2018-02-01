package mik.easj.skole.saveinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<String> OrdListe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void SaveClick(View view) {
        EditText UserInput = (EditText) findViewById(R.id.UserInput);
        OrdListe.add(UserInput.getText().toString());
        UserInput.setText("");
    }

    public void ClearClicked(View view) {
        OrdListe.clear();
    }

    public void ShowClicked(View view) {
        TextView _TextView = (TextView) findViewById(R.id.ListeTV);
        StringBuilder _StringBuilder = new StringBuilder();
        for(String i : OrdListe){
            _StringBuilder.append(i).append('\n');
        }
        _TextView.setText(_StringBuilder);


    }
}
