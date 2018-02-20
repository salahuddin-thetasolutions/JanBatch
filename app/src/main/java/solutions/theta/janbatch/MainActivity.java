package solutions.theta.janbatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mbtSave,mbtDefault,mbtClear,mbtSetImage;
    EditText metName,metEmail;
    CheckBox mcbUser,mcbAdmin;
    ImageView mLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {
        metName=(EditText)findViewById(R.id.etName);
        metEmail=(EditText)findViewById(R.id.etEmail);
        mbtSave=(Button) findViewById(R.id.btSave);
        mbtDefault=(Button) findViewById(R.id.btDefault);
        mbtClear=(Button) findViewById(R.id.btClear);
        mbtSetImage=(Button) findViewById(R.id.btSetImage);
        mcbUser=(CheckBox) findViewById(R.id.cbUser);
        mcbAdmin=(CheckBox) findViewById(R.id.cbAdmin);
        mLogo=(ImageView) findViewById(R.id.imgLogo);
        mbtSave.setOnClickListener(this);
        mbtSetImage.setOnClickListener(this);
        mbtDefault.setOnClickListener(this);
        mbtClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSave:
                Toast.makeText(this, metName.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(this, metEmail.getText().toString(), Toast.LENGTH_SHORT).show();
                if(mcbUser.isChecked()){
                    Toast.makeText(this, mcbUser.getText(), Toast.LENGTH_SHORT).show();
                }
                if(mcbAdmin.isChecked()){
                    Toast.makeText(this, mcbAdmin.getText(), Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btDefault:
metName.setText("Ali");
                metEmail.setText("abc@gmail.com");
                break;
            case R.id.btClear:
                metName.setText("");
                metEmail.setText("");
                break;
            case R.id.btSetImage:
                mLogo.setImageResource(R.drawable.logo);
                break;
        }
    }
}
