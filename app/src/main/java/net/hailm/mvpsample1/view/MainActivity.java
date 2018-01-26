package net.hailm.mvpsample1.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import net.hailm.mvpsample1.R;
import net.hailm.mvpsample1.model.entity.Demo;
import net.hailm.mvpsample1.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    //Presenter
    private MainPresenter mainPresenter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        Button btnLoad = findViewById(R.id.btn_load_data);
        listView = findViewById(R.id.list_view);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.loadData();
            }
        });
    }

    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        listView.setAdapter(new ArrayAdapter<Demo>(this, android.R.layout.simple_list_item_1, listDemo));
    }
}