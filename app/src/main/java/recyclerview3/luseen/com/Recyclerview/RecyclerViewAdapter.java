package recyclerview3.luseen.com.Recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import recyclerview3.luseen.com.recyclerview3.R;

/**
 * Created by Chatikyan on 24.07.2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Library> users;
    private Context context;

    public RecyclerViewAdapter(Context context, ArrayList<Library> users) {
        this.users = users;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView text1;

        public ViewHolder(View itemView) {
            super(itemView);
            this.text1 = (TextView) itemView.findViewById(R.id.text1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();
                    Library library = users.get(position);
                    Toast.makeText(context, position + 1 + "", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, OnclickActivity.class);
                    intent.putExtra("1", position);
                    intent.putExtra("2", library.getName());
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.views, viewGroup, false);
        return new RecyclerViewAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        Library user = users.get(position);
        viewHolder.text1.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

}
