package com.martin.mvc.legaltalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.martin.mvc.legaltalk.util.BaseActivity;

public class RegistActivity extends BaseActivity {


    final String[] userKinds = new String[]{"用户注册","律师注册"};
    final int[] registPage = new int[]{R.layout.activity_regist,R.layout.activity_regist_lawyer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String userKind = intent.getStringExtra("user_kinds");
        int pageId = -1;
        if(userKind.equals(userKinds[0])){ pageId = registPage[0];}
        else {pageId = registPage[1];}
        setContentView(pageId);
    }
}
