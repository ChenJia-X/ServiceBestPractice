package com.example.servicebestpractice;

/**
 * Created by man on 2018/2/10.
 */

/**
 * 负责监听下载状态，并根据状态进行回调。
 */
public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}