package com.example.thuchanhtuan2_1bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtHoTen=findViewById(R.id.edtHoten);
        EditText edtCmnd=findViewById(R.id.edtCMND);
        TextView tvThongBaoHoTen=findViewById(R.id.tvTbHoTen);
        TextView tvThongBaoCMND=findViewById(R.id.tvTbCMND);
        CheckBox chkDocBao=findViewById(R.id.checkboxDocBao);
        CheckBox chkDocSach=findViewById(R.id.checkboxDocSach);
        CheckBox chkDocCoding=findViewById(R.id.checkboxDocCoding);
        TextView tvThongBaoST=findViewById(R.id.tvTbSoThich);
        Button btnGuiThongTin=findViewById(R.id.buttonGuiThongTin);

        btnGuiThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hoTen=edtHoTen.getText().toString();
                String Cmnd=edtCmnd.getText().toString();
                if(hoTen.equals("")&&!hoTen.matches("^[A-Za-z0-9 ]{3,}")){
                    tvThongBaoHoTen.setText("Tên người không được để trống và phải có ít nhất 3 ký tự");
                    edtHoTen.setFocusable(true);
                    edtHoTen.selectAll();
                    return;
                }

                if(!Cmnd.matches("^[0-9]{9}$")||Cmnd.equals("")){
                    tvThongBaoCMND.setText("Chứng minh nhân dân chỉ được nhập kiểu số và phải có đúng 9 chữ số");
                    edtHoTen.setFocusable(true);
                    edtHoTen.selectAll();
                    return;
                }
                if(!chkDocBao.isChecked()&&!chkDocCoding.isChecked()&&!chkDocSach.isChecked()){
                    tvThongBaoST.setText("Sở thích phải chọn ít nhất 1 chọn lựa");
                    return;
                }
                tvThongBaoHoTen.setText("");
                tvThongBaoCMND.setText("");
                tvThongBaoST.setText("");
                Toast.makeText(MainActivity.this, "Thành công", Toast.LENGTH_SHORT).show();
                edtHoTen.setText("");
                edtCmnd.setText("");
                chkDocBao.setChecked(false);
                chkDocCoding.setChecked(false);
                chkDocSach.setChecked(false);
            }
        });

    }
}