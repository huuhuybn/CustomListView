package vn.poly.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {

    private List<Student> students;
    private Context context;

    public StudentAdapter(Context context,List<Student> students){
        this.students = students;
        this.context = context;

    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);

        TextView tvId = view.findViewById(R.id.tvId);

        TextView tvName = view.findViewById(R.id.tvName);

        TextView tvPhone = view.findViewById(R.id.tvPhone);

        tvId.setText(students.get(position).getId());
        tvName.setText(students.get(position).getName());
        tvPhone.setText(students.get(position).getNumberPhone());

        return view;
    }
}
