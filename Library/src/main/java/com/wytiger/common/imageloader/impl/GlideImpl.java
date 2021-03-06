package com.wytiger.common.imageloader.impl;



import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wytiger.common.imageloader.IImageInterface;

import java.io.File;

/**
 * description:
 * Created by wytiger on 2017-2-5.
 */
public class GlideImpl implements IImageInterface {
    private static class SingletonHolder {
        private static final GlideImpl INSTANCE = new GlideImpl();
    }

    public static IImageInterface getInstance() {
        return GlideImpl.SingletonHolder.INSTANCE;
    }

    @Override
    public void displayImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }

    @Override
    public void displayImage(ImageView imageView, File file) {
        Glide.with(imageView.getContext())
                .load(file)
                .into(imageView);
    }

    @Override
    public void displayImage(ImageView imageView, Uri uri) {
        Glide.with(imageView.getContext())
                .load(uri)
                .into(imageView);
    }

    @Override
    public void displayImage(Context context, ImageView imageView, String url) {
        Glide.with(context)
                .load(url)
                .into(imageView);
    }

    @Override
    public void displayImage(Activity activity, ImageView imageView, String url) {
        Glide.with(activity)
                .load(url)
                .into(imageView);
    }

    @Override
    public void displayImage(Fragment fragment, ImageView imageView, String url) {
        Glide.with(fragment)
                .load(url)
                .into(imageView);
    }

    @Override
    public void displayImage(Context context, ImageView imageView, String url, int placeholderResId, int errorResId) {
        Glide.with(context)
                .load(url)
                .placeholder(placeholderResId)
                .error(errorResId)
                .into(imageView);
    }

}
