package net.hailm.mvpsample1.presenter;

import android.widget.Button;

import net.hailm.mvpsample1.model.LoadDemoListener;
import net.hailm.mvpsample1.model.UserInterator;
import net.hailm.mvpsample1.model.entity.Demo;
import net.hailm.mvpsample1.view.MainView;

import java.util.List;

/**
 * Created by hai.lm on 26/01/2018.
 */

public class MainPresenter implements LoadDemoListener {
    private UserInterator mainInterator;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        mainInterator = new UserInterator(this);
    }

    public void loadData() {
        mainInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {
        //Làm gì đó nếu xảy ra lỗi.
    }
}
