package shadercat.havvka_mobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    private LayoutInflater inflater;
    private int layout;
    private List<Item> food;

    public ItemAdapter(Context context, int resourse, List<Item> food)
    {
        super(context, resourse, food);
        this.food = food;
        this.layout = resourse;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View view = inflater.inflate(this.layout, parent, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView nameView = (TextView) view.findViewById(R.id.name);
        TextView smallDescrView = (TextView) view.findViewById(R.id.smallDescription);

        Item itemList = food.get(position);

        imageView.setImageResource(itemList.GetImage());
        nameView.setText(itemList.GetName());
        smallDescrView.setText(itemList.GetSmallDescr());

        return  view;
    }
}
