package com.zhuandian.qrcode_phone;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.zhuandian.base.BaseActivity;
import com.zhuandian.qrcode_phone.utils.QrCodeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.et_content)
    EditText etContent;
    @BindView(R.id.btn_create)
    Button btnCreate;
    @BindView(R.id.iv_qrcode)
    ImageView ivQrcode;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUpView() {


    }



    @OnClick(R.id.btn_create)
    public void onViewClicked() {
        String content = etContent.getText().toString();
        if (!TextUtils.isEmpty(content)){
            Bitmap qrCodeBitmap = QrCodeUtils.createQRCodeBitmap(content, 300, 300);
            ivQrcode.setImageBitmap(qrCodeBitmap);
        }
    }
}
