package net.hailm.mvpsample1.model;

import net.hailm.mvpsample1.model.entity.Demo;

import java.util.List;

/**
 * Created by hai.lm on 26/01/2018.
 */

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);
    void onLoadDemoFailure(String message);
}
