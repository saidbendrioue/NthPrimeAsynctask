package com.example.said.myapplication01;

import android.os.AsyncTask;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NthPrimeTask extends AsyncTask<Integer,void,Integer[]> {
    @Override
    protected Integer[] doInBackground(Integer... params) {
       return nthPrimes(params[0]);
    }
    @Override
    protected void onPostExecute(Integer[] result) {
        String output = "";
        for (int i = 0; i <result.length ; i++) {
            output = output +"\n"+result[i];
        }
        NthPrimeActivity.nthPrimeresultview.setText(output);
    }


    public static boolean isPrime( Integer number ) {
        return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0);
    }
    public Integer[] nthPrimes( Integer n ){
        return IntStream.rangeClosed(2, n).filter(NthPrimeTask::isPrime).boxed().toArray( Integer[]::new );
    }
}
