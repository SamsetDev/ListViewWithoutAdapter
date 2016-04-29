package com.samset.listviewwithoutadapter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LinearLayout layout;
    int i;
    // you can replace your list data size
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.main);




        for ( i = 0; i < getList().size(); i++) {

            LinearLayout ll = new LinearLayout(this);
            ll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            ll.setOrientation(LinearLayout.VERTICAL);

                TextView text = new TextView(MainActivity.this);
                text.setTypeface(text.getTypeface(),Typeface.BOLD);
                text.setPadding(10, 10, 10, 10);
                text.setText(getList().get(i));
                text.setTag(""+getList().get(i));
                text.setOnClickListener(btnClickListener);
                ll.addView(text);


            layout.addView(ll);

        }

    }
    View.OnClickListener btnClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Toast " + v.getTag(),
                    Toast.LENGTH_SHORT).show();
        }

    };

    private ArrayList<String> getList()
    {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("item1");
        strings.add("item2");
        strings.add("item3");
        strings.add("item4");
        strings.add("item5");
        strings.add("item6");
        strings.add("item7");
        strings.add("item8");
        strings.add("item9");
        strings.add("item10");
        strings.add("item11");
        strings.add("item12");
        strings.add("item13");
        strings.add("item14");
        strings.add("item15");
        strings.add("item16");
        strings.add("item17");
        strings.add("item18");
        strings.add("item19");
        strings.add("item20");
        strings.add("item21");

        strings.add("item22");
        strings.add("item23");
        strings.add("item24");
        strings.add("item25");
        strings.add("item26");
        strings.add("item27");
        strings.add("item28");
        strings.add("item29");
        strings.add("item30");
        strings.add("item31");
        strings.add("item32");
        strings.add("item33");
        strings.add("item34");
        strings.add("item35");
        strings.add("item36");
        strings.add("item37");
        strings.add("item38");
        strings.add("item39");
        strings.add("item40");
   return strings;
    }
}
