package com.example.free_app.photoalbumsandphoto;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

public class UpdateDialog extends DialogFragment {

    private TextView updatePhoto;
    private TextView takePhoto;
    private SelectType mSelectType;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        mSelectType = (SelectType) getActivity();
        View view = inflater.inflate(R.layout.update_photo, container);
        updatePhoto = view.findViewById(R.id.tv_open_photo);
        takePhoto = view.findViewById(R.id.tv_take_photo);
        updatePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSelectType.selectType("打开相册",1);
                dismiss();
            }
        });
        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mSelectType.selectType("拍照",2);
            dismiss();
            }
        });
        return view;
    }

    public interface SelectType {
        void selectType(String type,int type2);
    }
}
