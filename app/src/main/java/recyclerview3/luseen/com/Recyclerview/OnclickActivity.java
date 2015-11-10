package recyclerview3.luseen.com.Recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import recyclerview3.luseen.com.recyclerview3.R;

public class OnclickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String text = intent.getStringExtra("2");
        int position = intent.getIntExtra("1", 0);
        TextView textView = (TextView) findViewById(R.id.text);
        int newPosition = position + 1;
        textView.setText(text + "  Position : " + newPosition);
    }
}
