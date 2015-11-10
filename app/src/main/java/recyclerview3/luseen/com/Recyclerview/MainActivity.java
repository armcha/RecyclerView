package recyclerview3.luseen.com.Recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import recyclerview3.luseen.com.recyclerview3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, getThronesCharacters());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Library> getThronesCharacters() {
        ArrayList<Library> item = new ArrayList<>();
        for (int text = 0; text < 100; text++) {
            item.add(new Library("Text : "+text));
        }
        return item;
    }
}
