//Copyright (c) 2017. 章钦豪. All rights reserved.
package com.monke.monkeybook.view.impl;

import android.content.SharedPreferences;

import com.monke.basemvplib.impl.IView;
import com.monke.monkeybook.bean.BookShelfBean;

import java.util.List;

public interface IMainView extends IView{

    /**
     * 刷新书架书籍小说信息 更新UI
     * @param bookShelfBeanList 书架
     */
    void refreshBookShelf(List<BookShelfBean> bookShelfBeanList);

    void refreshBook(String noteUrl);

    /**
     * 执行刷新书架小说信息
     */
    void activityRefreshView();

    /**
     * 刷新完成
     */
    void refreshFinish();

    /**
     * 刷新错误
     * @param error 错误
     */
    void refreshError(String error);

    /**
     * 显示等待框
     */
    void showLoading(String msg);

    void onRestore();

    SharedPreferences getPreferences();
}
