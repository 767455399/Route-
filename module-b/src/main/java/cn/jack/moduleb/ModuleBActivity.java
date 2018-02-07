package cn.jack.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jack.portal.annotation.PortalPath;

@PortalPath("BBB")
public class ModuleBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_b);
    }
}
