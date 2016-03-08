package com.sarleon.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonplus;
    Button button0minus;
    Button button0mutiply;
    Button button0divide;
    Button buttonbackspace;
    Button button0clear;
    Button buttonequals;
    Button buttonpow;
    TextView outputview;
   OutputList<Character> outputList=new OutputList<Character>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        outputview= (TextView) findViewById(R.id.textView);
        outputview.setText("");


        button0= (Button) findViewById(R.id.button0);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        buttonplus= (Button) findViewById(R.id.buttonplus);
        button0minus= (Button) findViewById(R.id.buttonminus);
        button0mutiply= (Button) findViewById(R.id.buttonmutiply);
        button0divide= (Button) findViewById(R.id.buttondivide);
        buttonbackspace= (Button) findViewById(R.id.buttonbackspace);
        button0clear= (Button) findViewById(R.id.buttonclear);
        buttonequals= (Button) findViewById(R.id.buttonequals);
        buttonpow= (Button) findViewById(R.id.buttonpow);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonplus.setOnClickListener(this);
        button0minus.setOnClickListener(this);
        button0mutiply.setOnClickListener(this);
        button0divide.setOnClickListener(this);
        buttonbackspace.setOnClickListener(this);
        button0clear.setOnClickListener(this);
        buttonequals.setOnClickListener(this);
        buttonpow.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent();

            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:outputList.add('0');outputview.setText(outputList.toString());break;
            case R.id.button1:outputList.add('1');outputview.setText(outputList.toString());break;
            case R.id.button2:outputList.add('2');outputview.setText(outputList.toString());break;
            case R.id.button3:outputList.add('3');outputview.setText(outputList.toString());break;
            case R.id.button4:outputList.add('4');outputview.setText(outputList.toString());break;
            case R.id.button5:outputList.add('5');outputview.setText(outputList.toString());break;
            case R.id.button6:outputList.add('6');outputview.setText(outputList.toString());break;
            case R.id.button7:outputList.add('7');outputview.setText(outputList.toString());break;
            case R.id.button8:outputList.add('8');outputview.setText(outputList.toString());break;
            case R.id.button9:outputList.add('9');outputview.setText(outputList.toString());break;
            case R.id.buttonplus:outputList.add('+');outputview.setText(outputList.toString());break;
            case R.id.buttonminus:outputList.add('-');outputview.setText(outputList.toString());break;
            case R.id.buttonmutiply:outputList.add('×');outputview.setText(outputList.toString());break;
            case R.id.buttondivide:outputList.add('÷');outputview.setText(outputList.toString());break;
            case R.id.buttonbackspace:if(outputList.size()!=0)outputList.remove(outputList.size() - 1);outputview.setText(outputList.toString());break;
            case R.id.buttonclear:outputList.clear();outputview.setText(outputList.toString());break;
            case R.id.buttonequals:Caculate.transform(outputview, outputList);break;
            case R.id.buttonpow:outputList.add('^');outputview.setText(outputList.toString());break;



        }

    }
}
