package top.wuhaojie.week.presenter;

import top.wuhaojie.week.base.BasePresenter;
import top.wuhaojie.week.base.BaseView;

/**
 * Author: wuhaojie
 * E-mail: w19961009@126.com
 * Date: 2017/02/13 12:01
 * Version: 1.0
 */

public interface MainHolder {

    interface View extends BaseView{
        void back();
    }

    interface Presenter extends BasePresenter{
        void onBackPressed();
    }
}
