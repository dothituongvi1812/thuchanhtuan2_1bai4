package com.example.thuchanhtuan2_1bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtHoTen=findViewById(R.id.edtHoten);
        EditText edtCmnd=findViewById(R.id.edtCMND);
        Button btnGuiThongTin=findViewById(R.id.buttonGuiThongTin);
        btnGuiThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoTen=edtHoTen.getText().toString();
                String Cmnd=edtCmnd.getText().toString();
                if(hoTen.length()<0&&!hoTen.matches("^[A-Za-z]{3,}")){
                    Toast.makeText(MainActivity.this,"Tên người không được để trống và phải có ít nhất 3 ký tự",Toast.LENGTH_SHORT).show();
                }
                if(!Cmnd.matches("^[0-9]{9}$")){
                    Toast.makeText(MainActivity.this,"Chứng minh nhân dân chỉ được nhập kiểu số và phải có đúng 9 chữ số7",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}