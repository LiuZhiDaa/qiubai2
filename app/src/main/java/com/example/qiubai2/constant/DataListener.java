package com.example.qiubai2.constant;

/**
 * Created by 44744 on 2016/4/18.
 */
public interface DataListener {
    /*
    成功回调的数据实体
     */
    void onSuccess(Object o);
    /*
    失败回调的数据实体
     */
    void onError(Throwable throwable);
}
