package zhao.siqi.mvptestdemo.mvp.contract;

import java.util.List;

import zhao.siqi.mvptestdemo.base.BasePresenter;
import zhao.siqi.mvptestdemo.base.BaseView;
import zhao.siqi.mvptestdemo.bean.ProjectProgressList;

/**
 * 直接明了的看到View和Presenter之间的方法。
 * <p>
 * Created by Bill on 2017/9/5.
 */
public interface MainContract {

    /**
     * UI操作
     */
    interface View extends BaseView<Presenter> {

        void setDataToAdapter(List<ProjectProgressList.DataBean> mData);

        void refreshView();
    }

    /**
     * 数据和逻辑操作
     */
    interface Presenter extends BasePresenter {

        void loadDataFromServer();

    }
}
