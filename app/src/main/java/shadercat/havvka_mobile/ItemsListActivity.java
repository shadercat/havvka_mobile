package shadercat.havvka_mobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

//activity with list
public class ItemsListActivity extends AppCompatActivity {

    private List<Item> listOfItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);

        ListView list = findViewById(R.id.itemsList);

        for(int i = 0; i < 101; i++)
        {
            listOfItems.add(new Item("Name of Food", "Small descrition","Big Description", R.drawable.food_test));
        }

        ItemAdapter adapter = new ItemAdapter(this, R.layout.list_item, listOfItems);

        list.setAdapter(adapter);

    }
}
