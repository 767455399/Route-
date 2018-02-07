package cn.jack.modulec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cn.jack.portal.annotation.PortalPath;

@PortalPath("CCC")
public class ModuleCActivity extends AppCompatActivity {

    private EditText edit;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_c);

        edit = findViewById(R.id.edit);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("result", edit.getText().toString());
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

    }
}
