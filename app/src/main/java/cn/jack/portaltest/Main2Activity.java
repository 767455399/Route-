package cn.jack.portaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jack.portal.Portal;
import cn.jack.portal.annotation.PortalPath;

@PortalPath("AAAAAPPPP")
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Portal.with(this).start("ModuleMainActivity");
    }
}
