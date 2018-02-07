package cn.jack.modulea;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jack.portal.annotation.PortalPath;

@PortalPath("AAA")
public class ModuleAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_a);
    }
}
