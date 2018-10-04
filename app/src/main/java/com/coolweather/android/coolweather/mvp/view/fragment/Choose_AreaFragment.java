package com.coolweather.android.coolweather.mvp.view.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.coolweather.android.coolweather.R;
import com.coolweather.android.coolweather.db.City;
import com.coolweather.android.coolweather.db.County;
import com.coolweather.android.coolweather.db.Province;
import com.coolweather.android.coolweather.util.HttpUtil;
import com.coolweather.android.coolweather.util.Utility;

import org.litepal.crud.DataSupport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * author:Created by YangYong on 2018/10/4.
 */
public class Choose_AreaFragment extends Fragment implements View.OnClickListener {

    public static final int LEVEL_PROVINCE = 0;
    public static final int LEVEL_CIEY = 1;
    public static final int LEVEL_CIUNTY = 2;

    private ProgressDialog progressDialog;
    private View view;
    private TextView mTitleText;
    private Button mBackButton;
    private ListView mListView;
    private int currentLevel;
    private List<Province> provinceList;
    private List<City> cityList;
    private Province selectedProvince;
    private City selectedCity;
    private County selectedCounty;
    private List<County> countyList;
    private List<String> dataList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choose_area, container, false);
        initView(view);
        initDate();
        return view;
    }

    private void initDate() {
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dataList);
        mListView.setAdapter(adapter);
    }

    private void initView(View view) {
        mTitleText = (TextView) view.findViewById(R.id.title_text);
        mBackButton = (Button) view.findViewById(R.id.back_button);
        mBackButton.setOnClickListener(this);
        mListView = (ListView) view.findViewById(R.id.list_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.back_button:
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (currentLevel == LEVEL_PROVINCE) {

                     selectedProvince = provinceList.get(i);
                    queryCities();
                } else if (currentLevel == LEVEL_CIEY) {

                    selectedCity = cityList.get(i);
                    queryCounties();


                }
            }


        });
        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentLevel == LEVEL_CIUNTY) {

                    queryCities();
                } else if (currentLevel == LEVEL_CIEY) {
                    queryProvinces();
                }
            }
        });
        queryProvinces();
    }

    /*
     * 查詢全國所有省
     * */
    private void queryProvinces() {
        mTitleText.setText("中國");
        mBackButton.setVisibility(View.GONE);
        provinceList = DataSupport.findAll(Province.class);
        if (provinceList.size() > 0) {
            dataList.clear();
            for (Province province : provinceList) {
                dataList.add(province.getProvinceName());
            }
            adapter.notifyDataSetInvalidated();
            mListView.setSelection(0);
            currentLevel = LEVEL_PROVINCE;
        } else {
            String address = "http://guolin.tech/api/china";
            queryFromServer(address, "province");
        }
    }

    private void queryFromServer(String address, final String province) {

        HttpUtil.sendOkhttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        closeProgressDialog();
                        Toast.makeText(getContext(),"加載失敗",Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String string = response.body().string();
                boolean result = false;
                if ("province".equals(province)) {
                    Utility.handleProvinceResponse(string);
                } else if ("city".equals(province)) {
                    Utility.handleCityResponse(string, selectedProvince.getId());
                } else if ("county".equals(province)) {
                    Utility.handleCountyResponse(string, selectedCity.getId());

                }
                if (result) {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            closeProgressDialog();
                            if ("province".equals(province)) {
                                queryProvinces();
                            } else if ("city".equals(province)) {
                                queryCities();
                            } else if ("county".equals(province)) {
                                queryCounties();
                            }
                        }


                    });
                }
            }

        });

    }

//顯示對畫框
    private void showProgressDialog() {
        if(progressDialog==null){
            progressDialog=new ProgressDialog(getContext());
            progressDialog.setMessage("正在加載。。");
            progressDialog.setCanceledOnTouchOutside(false);
        }
        progressDialog.show();
    }

    //關閉對話框
    private void closeProgressDialog(){
        if(progressDialog!=null){
            progressDialog.dismiss();
        }
    }
    private void queryCounties() {
        mTitleText.setText(selectedCity.getCityName());
        mBackButton.setVisibility(View.VISIBLE);
        countyList = DataSupport.where("cityid=?", String.valueOf(selectedCity.getId())).find(County.class);
        if (countyList.size() > 0) {
            dataList.clear();
            for (County county : countyList) {
                dataList.add(county.getCountyName());
            }
            adapter.notifyDataSetInvalidated();
            mListView.setSelection(0);
            currentLevel = LEVEL_CIUNTY;
        } else {
            int provinceCode = selectedProvince.getProvinceCode();
            int cityCode = selectedCity.getCityCode();
            String address = "http://guolin.tech/api/china/" + provinceCode + "/" + cityCode;
            queryFromServer(address, "county");
        }
    }

    /*
     *
     * 查詢市
     * */
    private void queryCities() {
        mTitleText.setText(selectedProvince.getProvinceName()+"");
        mBackButton.setVisibility(View.VISIBLE);
        cityList = DataSupport.where("provinceid=?", String.valueOf(selectedProvince.getId())).find(City.class);

        if (cityList.size() > 0) {
            dataList.clear();
            for (City city : cityList) {
                dataList.add(city.getCityName());
            }
            adapter.notifyDataSetInvalidated();
            mListView.setSelection(0);
            currentLevel = LEVEL_CIEY;
        } else {
            int provinceCode = selectedProvince.getProvinceCode();
            String address = "http://guolin.tech/api/china/" + provinceCode;
            queryFromServer(address, "city");
        }

    }
}
