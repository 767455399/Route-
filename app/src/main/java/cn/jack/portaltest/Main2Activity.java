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

    /**
     * Portal(传送门)使用文档
     Activity
     @PortalPath("ActivityA")
     public class ActivityA extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     }
     }
     Portal.with(context).start("ActivityA");



     ********************************
     Fragment
     @PortalPath("FragmentA")
     @FragmentActivity(FragmentParentActivity.class)
     public class FragmentA extends Fragment {

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
     // Inflate the layout for this fragment
     return inflater.inflate(R.layout.fragment_baidu, container, false);
     }

     }
     Portal.with(context).start("FragmentA");


     *****************************
     Interceptor
     public class LoginInterceptor extends BaseInterceptor {


     @Override
     public boolean onInterceptor(Context context, String path) {
     if(Account.isLogin){
     return true;
     }else {
     Portal.with(context).start("LoginActivity");
     return false;
     }
     }
     }


     @PortalPath("ActivityA")
     @PortalInterceptor(LoginInterceptor.class)
     public class ActivityA extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     }
     }
     @PortalInterceptor({LoginInterceptor.class,OtherInterceptor.class...})


     *******************************
     PathTransform
     Portal.addPathTransform(oldPath,newPath);
     Portal.removePathTransform(oldPath);
     Portal.clearPathTransform();



     *****************************
     Param
     Portal.with(context).putString(key,value).putInt(key,value).start(path);


     *******************************
     ActivityDelegate
     Portal.with(context).start(path, requestCode, new ActivityDelegate() {

     @Override
     public void onResume() {
     super.onResume();
     }

     @Override
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
     super.onActivityResult(requestCode, resultCode, data);
     }
     });

     *********************
      * 添加代码库
     dependencies {
     implementation 'cn.jack:portal:1.0.2'
     annotationProcessor 'cn.jack:portal-compiler:1.0.2'
     }
     */
}
