package swengb.rauchenwald.modulocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String numDividend;
    private String numDivisor;
    private TextView txtViewResultQuotient;
    private TextView txtViewResultRemainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewResultQuotient = (TextView)findViewById(R.id.txtViewQuotientResult);
        txtViewResultRemainder = (TextView)findViewById(R.id.txtViewRemainderResult);
    }


    public void calcModulo(View view)
    {
        numDividend = ((EditText) findViewById(R.id.edTxtDividend)).getText().toString();
        numDivisor = ((EditText) findViewById(R.id.edTxtDivisor)).getText().toString();

        try
        {
            double moduloResult = Double.parseDouble(numDividend) % Double.parseDouble(numDivisor);
            txtViewResultQuotient.setText(numDivisor);
            txtViewResultRemainder.setText(String.valueOf(moduloResult));
        }
        catch (NumberFormatException e)
        {
            txtViewResultQuotient.setText("Wrong input!");
            txtViewResultRemainder.setText("Wrong input!");
            e.printStackTrace();
        }
    }
}
