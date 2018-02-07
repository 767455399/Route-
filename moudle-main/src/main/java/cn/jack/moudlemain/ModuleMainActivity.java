package cn.jack.moudlemain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cn.jack.portal.ActivityDelegate;
import cn.jack.portal.Portal;
import cn.jack.portal.annotation.PortalPath;

@PortalPath("ModuleMainActivity")
public class ModuleMainActivity extends AppCompatActivity {

    private EditText edit;
    private Button btn;
    private TextView text;
    private Button btn2;
    private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_main);
        edit = findViewById(R.id.edit);
        btn = findViewById(R.id.btn);
        text = findViewById(R.id.text);
        btn2 = findViewById(R.id.btn2);
        text2 = findViewById(R.id.text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Portal.with(ModuleMainActivity.this).start(edit.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Portal.with(ModuleMainActivity.this).start(edit.getText().toString(),new ActivityDelegate(){
                    @Override
                    public void onActivityResult(int requestCode, int resultCode, Intent data) {
                        super.onActivityResult(requestCode, resultCode, data);
                        text2.setText("onActivityResult的返回结果为："+data.getStringExtra("result"));
                    }
                });
            }
        });

    }
}
