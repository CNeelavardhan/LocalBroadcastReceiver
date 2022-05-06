package com.huawei.neelavardhan.batterypercentage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class Batteryreceiver extends BroadcastReceiver {

    TextView textView;
    Batteryreceiver(TextView textView){
        this.textView=textView;

    }
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage= intent.getIntExtra("level",0);
        if(percentage!=0){
            textView.setText(percentage + "%");
        }
    }
}
