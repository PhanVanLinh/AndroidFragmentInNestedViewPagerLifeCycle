package com.toong.androidviewpagerskeleton.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.toong.androidviewpagerskeleton.BaseFragment;
import com.toong.androidviewpagerskeleton.MainActivity;
import com.toong.androidviewpagerskeleton.R;
import com.toong.androidviewpagerskeleton.SecondActivity;

public class Fragment1 extends BaseFragment {
    private static String TAG = "Fragment1";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);

        rootView.findViewById(R.id.button_go_to_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivityForResult(intent, 200);
            }
        });

        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                ((MainActivity) getActivity()).mPager.setCurrentItem(1);
            }
        });
    }
}
