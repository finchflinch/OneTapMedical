package com.example.shiva.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class genQR extends AppCompatActivity {

    //my code
    private EditText editText;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gen_q_r);

        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.qr_img);
    }
    public void QRCodeGeneration(View view) {
        //defining the qrcode writer
        int qrWidth = 200;
        int qrHeight = 200;
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(editText.getText().toString(), BarcodeFormat.QR_CODE, qrWidth, qrHeight);
            Bitmap bitmap = Bitmap.createBitmap(qrWidth, qrHeight, Bitmap.Config.RGB_565);

            // iterator for each pixel
            for (int eachWPixel = 0; eachWPixel < qrWidth; eachWPixel++) {
                for (int eachHPixel = 0; eachHPixel < qrHeight; eachHPixel++) {
                    bitmap.setPixel(
                            eachWPixel,
                            eachHPixel,
                            bitMatrix.get(eachWPixel, eachHPixel) ? Color.BLACK : Color.WHITE);     // if true, then assign black, else white
                }
            }
            imageView.setImageBitmap((bitmap));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}